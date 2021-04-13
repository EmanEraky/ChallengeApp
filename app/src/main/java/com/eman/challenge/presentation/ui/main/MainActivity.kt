package com.eman.challenge.presentation.ui.main

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eman.challenge.R
import com.eman.challenge.databinding.ActivityMainBinding
import com.eman.challenge.domain.model.BaseModelMarvel
import com.eman.challenge.domain.model.MarvelDataContainer
import com.eman.challenge.presentation.NavigationListener
import com.eman.challenge.presentation.ui.detail.DetailsActivity
import com.eman.challenge.utils.Status
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity(), NavigationListener {
    lateinit var binding: ActivityMainBinding
    private var totalBusiness = 0
    private var isLoading: Boolean = false
    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var adapter: MainCharacterAdapter
    private lateinit var nAdapter: NameCharacterAdapter


    //list for holding data
    lateinit var list: ArrayList<BaseModelMarvel>
    var startPos = 0
    var name = ""
    var flagSearch = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        list = ArrayList()
        nAdapter = NameCharacterAdapter(arrayListOf(), this)
        adapter = MainCharacterAdapter(arrayListOf(), this)
        binding.mainAdapter = adapter

        binding.laySearch.laySearch.setOnClickListener { }

        binding.toolSearch.imgSearch.setOnClickListener {
            binding.laySearch.laySearch.startAnimation(
                AnimationUtils.loadAnimation(
                    this,
                    R.anim.slide_in
                )
            )
            binding.toolSearch.imgSearch.visibility = View.GONE
            binding.laySearch.laySearch.visibility = View.VISIBLE
        }

        binding.laySearch.txtCancel.setOnClickListener {
            resetSearchView()
        }

        binding.laySearch.edtSearch.setOnEditorActionListener(object :
            TextView.OnEditorActionListener {
            override fun onEditorAction(p0: TextView?, actionId: Int, p2: KeyEvent?): Boolean {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    flagSearch = true
                    name = binding.laySearch.edtSearch.text.toString()
                    if (name != "")
                        mainViewModel.getCharactersBeginLetter(10, name)
                    binding.laySearch.edtSearch.setText("")
                    return true
                }
                return false
            }
        })


        setObserveNameCharacter()
        setObserveCharacter()
        addScrollerListener()
    }

   private fun resetSearchView(){
        nAdapter.addData(emptyList())
        nAdapter.notifyDataSetChanged()
        binding.toolSearch.imgSearch.visibility = View.VISIBLE
        binding.laySearch.laySearch.visibility = View.GONE
    }


    private fun addScrollerListener() {
        binding.recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val firstvisibleItem =
                    (binding.recyclerView.getLayoutManager() as LinearLayoutManager).findFirstVisibleItemPosition()
                val visibleItems =
                    (binding.recyclerView.getLayoutManager() as LinearLayoutManager).getChildCount() //total visible
                val totalItemCount =
                    (binding.recyclerView.getLayoutManager() as LinearLayoutManager).getItemCount() //the total
                val lastItem = firstvisibleItem + visibleItems
                if (totalItemCount != totalBusiness && totalItemCount < totalBusiness) {
                    if (lastItem == totalItemCount) {
                        val listCount = list.size
                        if (totalBusiness > listCount && totalBusiness > 0 && isLoading == false) {
                            isLoading = true
                            val rest_count = totalBusiness - listCount

                            if ((listCount != totalBusiness) && (rest_count != 0))
                                mainViewModel.getCharactersResponse(totalItemCount, listCount)
                            startPos = listCount
                        }
                    }
                }
            }
        })
    }

    private fun setObserveCharacter() {
        mainViewModel.characters.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    it.data?.let { character ->
                        totalBusiness = character.data?.let {
                            it.total
                        }!!
                        renderList(character.data)
                    }
                    binding.recyclerView.visibility = View.VISIBLE
                }
                Status.ERROR -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
                Status.LOADING -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
            }
        })
    }

    private fun setObserveNameCharacter() {
        mainViewModel.nCharacters.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.laySearch.progressBar.visibility = View.GONE
                    it.data?.let { character ->
                        totalBusiness = character.data?.let {
                            it.total
                        }!!
                        renderList(character.data.results)
                    }
                }
                Status.ERROR -> {
                    binding.laySearch.progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
                Status.LOADING -> {
                    binding.laySearch.progressBar.visibility = View.VISIBLE
                }
            }
        })
    }


    private fun renderList(char: List<BaseModelMarvel>) {
        nAdapter.addData(char)
        nAdapter.notifyDataSetChanged()
        binding.laySearch.recyclerSearch.adapter = nAdapter
    }

    private fun renderList(char: MarvelDataContainer) {
        isLoading = false
        list.addAll(char.results)
        adapter.addData(list)
        adapter.notifyDataSetChanged()
        binding.recyclerView.layoutManager!!.scrollToPosition(startPos)
    }

    override fun onClickCharacter(view: View, id: Int) {
        if (binding.laySearch.laySearch.visibility == View.VISIBLE) {
            resetSearchView()
        }
        val animation: Animation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left)
        if (view != null) {
            view.startAnimation(animation)
        }
        val mIntent = Intent(this, DetailsActivity::class.java)
        mIntent.putExtra("CharacterId", id)
        startActivity(mIntent)
    }

    override fun onBackPressed() {
        if (binding.laySearch.laySearch.visibility == View.VISIBLE) {
            binding.laySearch.laySearch.visibility = View.GONE
            binding.toolSearch.imgSearch.visibility = View.VISIBLE
        } else {
            finish()
        }
    }
}