package com.eman.challenge.presentation.ui.detail

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.eman.challenge.R
import com.eman.challenge.databinding.ActivityDetailsBinding
import com.eman.challenge.utils.Status
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    private val detailsViewModel: DetailsViewModel by viewModels()
    lateinit var adapterComics: DetailsCharacterAdapter
    lateinit var adapterEvents: DetailsCharacterAdapter
    lateinit var adapterStores: DetailsCharacterAdapter
    lateinit var adapterSeries: DetailsCharacterAdapter

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_details)
        intent.getIntExtra("CharacterId", 0).let { detailsViewModel.getDetailsBusiness(it) }

        binding.imgBack.setOnClickListener {
            onBackPressed()
        }
        getObserveDetails()
    }

    fun getObserveDetails() {
        detailsViewModel.character.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.progressbar.visibility = View.GONE
                    it.data?.let {
                        it.let {
                            val obj = it.data?.results!!.get(0)
                            binding.charDetail = obj
                            if (obj.description == "") {
                                binding.titleDescription.visibility = View.GONE
                            } else {
                                binding.titleDescription.visibility = View.VISIBLE
                            }
                            adapterComics =
                                DetailsCharacterAdapter(obj.comics!!.items!!)
                            adapterEvents =
                                DetailsCharacterAdapter(obj.events!!.items!!)
                            adapterSeries =
                                DetailsCharacterAdapter(obj.series!!.items!!)
                            adapterStores =
                                DetailsCharacterAdapter(obj.stories!!.items!!)

                            binding.adapterComics = adapterComics
                            binding.adapterEvents = adapterEvents
                            binding.adapterSeries = adapterSeries
                            binding.adapterStores = adapterStores


                        }
                    }
                }
                Status.ERROR -> {
                    binding.progressbar.visibility = View.GONE
                }
                Status.LOADING ->
                    binding.progressbar.visibility = View.VISIBLE
            }
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

}