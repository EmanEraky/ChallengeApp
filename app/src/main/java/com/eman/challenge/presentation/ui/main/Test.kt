//package com.eman.challenge.presentation.ui.main
//
//import android.os.Bundle
//import android.text.Editable
//import android.text.TextWatcher
//import android.view.KeyEvent
//import android.view.View
//import android.view.inputmethod.EditorInfo
//import android.widget.TextView
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.prestoeat.driver.R
//import com.prestoeat.driver.data.Constant
//import com.prestoeat.driver.data.URLFactory
//import com.prestoeat.driver.data.pojo.OrderItem
//import com.prestoeat.driver.data.pojo.Parameter
//import com.prestoeat.driver.data.pojo.orderdetails.OrderDetails
//import com.prestoeat.driver.di.component.FragmentComponent
//import com.prestoeat.driver.extension.show
//import com.prestoeat.driver.ui.base.BaseActivity
//import com.prestoeat.driver.ui.base.BaseFragment
//import com.prestoeat.driver.ui.base.adapters.EndlessRecyclerViewScrollListener
//import com.prestoeat.driver.ui.base.adapters.RecyclerViewClickListenerWithData
//import com.prestoeat.driver.ui.home.adapter.MyOrderItemAdapter
//import com.prestoeat.driver.ui.home.viewmodel.HomeViewModel
//import com.prestoeat.driver.utils.LocationManager
//import com.prestoeat.driver.utils.hide
//import com.prestoeat.driver.utils.viewModelProvider
//import kotlinx.android.synthetic.main.fragment_home.toolbarHome
//import kotlinx.android.synthetic.main.fragment_my_delivery.*
//import javax.inject.Inject
//
//class MyDeliveryFragment : BaseFragment(), View.OnClickListener {
//
//
//    lateinit var orderData: OrderDetails
//    private lateinit var orderListAdapter: MyOrderItemAdapter
//
//    @Inject
//    lateinit var locationManager: LocationManager
//    override fun createLayout(): Int = R.layout.fragment_my_delivery
//
//
//    private var isLoading: Boolean = false
//
//    var page = 0
//
//    lateinit var parameter: Parameter
//    var search = ""
//    val orderList: ArrayList<OrderItem> = ArrayList()
//    val orderListSearch: ArrayList<OrderItem> = ArrayList()
//
//    lateinit var homeViewModel: HomeViewModel
//    override fun onCreate(savedInstanceState: Bundle?) {
//        homeViewModel = viewModelProvider(viewModelFactory)
//        registerObserver()
//        super.onCreate(savedInstanceState)
//
//
//        edittextName1.setOnEditorActionListener(object : TextView.OnEditorActionListener {
//            override fun onEditorAction(p0: TextView?, actionId: Int, p2: KeyEvent?): Boolean {
//                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
//                    search = edittextName1.text.toString()
//                    for (i in 0 until orderList.size) {
//                        if (orderList.get(i).order_id.toString().contains(search)) {
//                            orderListSearch.add(orderList.get(i))
//                        } }
//                    orderListAdapter.updataData(orderListSearch)
//                    return true
//                }
//                return false
//            }
//        })
//        edittextName1.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                if (p0?.length == 0) {
//                    orderListAdapter.updataData(orderList)
//                }
//            }
//            override fun afterTextChanged(p0: Editable?) {
//            }
//        })
//
//    }
//
//
//    private fun callOrderListAPI() {
//        parameter = Parameter()
//        parameter.page = page
//        homeViewModel.getOrderList(parameter)
//    }
//
//    private fun callOrderDetailsAPI(id: Int) {
//        parameter = Parameter()
//        parameter.orderId = id.toString()
//        toggleLoader(true)
//        homeViewModel.getOrderDetails(parameter)
//    }
//
//
//    private fun registerObserver() {
//
//        homeViewModel.orderListLiveData.observe(this, {
//            toggleLoader(false)
//            page++
//            progressBottom.hide()
//            when (it.responseCode) {
//
//                URLFactory.ResponseCode.SUCCESS -> {
//                    orderList.addAll(it.data!!)
//                    orderListAdapter.notifyDataSetChanged()
//                }
//                URLFactory.ResponseCode.ERROR -> {
//                    showCustomToastBlue(it.message)
//                }
//            }
//
//        })
//
//        homeViewModel.orderDetailsLiveData.observe(this, {
//            toggleLoader(false)
//            page++
//            progressBottom.hide()
//            when (it.responseCode) {
//
//                URLFactory.ResponseCode.SUCCESS -> {
//                    orderData = it.data!!
//                    val bundle = Bundle()
//                    bundle.putSerializable(Constant.SELECTED_ORDER, orderData)
//                    navigator.load(MyDeliveryOrderDetailsFragmentLive::class.java).setBundle(bundle)
//                        .replace(true)
//                }
//                URLFactory.ResponseCode.ERROR -> {
//                    showCustomToastBlue(it.message)
//                }
//            }
//
//        })
//    }
//
//
//    override fun inject(fragmentComponent: FragmentComponent) = fragmentComponent.inject(this)
//
//    override fun bindData() {
//        initView()
//        setOnClickListener()
//
//        val listener = RecyclerViewClickListenerWithData { _, _: View?, position: Int ->
//            callOrderDetailsAPI(orderList[position].order_id)
//        }
//
//
//
//        recyclerMyDelivery.apply {
//            orderListAdapter = MyOrderItemAdapter(orderList, listener)
//            adapter = orderListAdapter
//        }
//
//
//        toggleLoader(true)
//        callOrderListAPI()
//        setScrollListener()
//    }
//
//    private fun initView() {
//        toolbar.showToolbar(false)
//        toolbar.setToolbar(toolbarHome)
//        toolbar.setHomeIcon(R.drawable.ic_menu)
//
//        changeStatusBarColor()
//
//    }
//
//    private fun setScrollListener() {
//        recyclerMyDelivery.addOnScrollListener(object :
//            EndlessRecyclerViewScrollListener(recyclerMyDelivery.layoutManager as LinearLayoutManager) {
//            override fun onLoadMore(page: Int, totalItemsCount: Int, view: RecyclerView?) {
//                if (!isLoading) {
//                    progressBottom.show()
//                    callOrderListAPI()
//                    isLoading = true
//                }
//            }
//        })
//    }
//
//    private fun setOnClickListener() {
//
//    }
//
//    override fun changeStatusBarColor() {
//        (activity as BaseActivity).updateStatusBarColor(R.color.colorPrimary)
//    }
//
//    override fun onClick(view: View) {
//
//    }
//
//
//}