//package com.eman.challenge.presentation.ui.main
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.core.content.ContextCompat
//import androidx.recyclerview.widget.RecyclerView
//import com.prestoeat.driver.R
//import com.prestoeat.driver.data.Constant
//import com.prestoeat.driver.data.pojo.OrderItem
//import com.prestoeat.driver.ui.base.adapters.RecyclerViewClickListenerWithData
//import com.prestoeat.driver.utils.Formatter
//import com.prestoeat.driver.utils.getFormatedString
//import kotlinx.android.synthetic.main.item_my_order.view.*
//
//
//class MyOrderItemAdapter(private var list: ArrayList<OrderItem>, listener: RecyclerViewClickListenerWithData)
//    : RecyclerView.Adapter<MyOrderItemAdapter.MyViewHolder>() {
//    private var recyclerViewClickListener: RecyclerViewClickListenerWithData? = null
//
//    init {
//        this.recyclerViewClickListener = listener
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        val cellForRow = layoutInflater.inflate(R.layout.item_my_order, parent, false)
//        return MyViewHolder(cellForRow)
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//
//
//        holder.bindData(list[position])
//
//    }
//
//    override fun getItemCount(): Int = list.size
//
//
//    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bindData(orderItem: OrderItem) = with(itemView) {
//
//            textviewAddress.text = orderItem.order_food.pickup_address
//            textviewAddress2.text = orderItem.order_food.delivery_address
//            textViewOrderId.text = resources.getString(R.string.orderid_formate, orderItem.order_id.toString())
////            textViewOrderId.text = resources.getString(R.string.orderid_formate, orderItem.id.toString())
//
////            textViewOrderPrice.text = resources.getString(R.string.price_formate_float, orderItem.order_food.total, Constant.Currency.VALUE)
//            textViewOrderPrice.text =getFormatedString(context,R.string.price_formate_float, orderItem.order_food.total, Constant.Currency.VALUE)
//
//            textViewOrderDate.text = Formatter.format(orderItem.order_food.order_datetime, Formatter.YYYY_MM_DD_HH_MM_SS, Formatter.DD_MMM_YYYY__hh_mm_aa, true)
//
//
//            textviewOrderStatus.text = orderItem.order_food.status
//
//            if (orderItem.order_food.status == Constant.OrderStatus.Rejected || orderItem.order_food.status == Constant.OrderStatus.Cancled) {
//                textviewOrderStatus.apply {
//                    background = context.getDrawable(R.drawable.bg_rejected)
//                    setTextColor(ContextCompat.getColor(context, R.color.colorOrangeDebited))
//                }
//            } else {
//                textviewOrderStatus.apply {
//                    background = context.getDrawable(R.drawable.bg_delivered)
//                    setTextColor(ContextCompat.getColor(context, R.color.colorGreen))
//                }
//            }
//
//
//            itemView.setOnClickListener {
//                recyclerViewClickListener?.onClick(ArrayList(), it, adapterPosition)
//            }
//
//        }
//
//    }
//
//
//    fun updataData(list: ArrayList<OrderItem>) {
//        this.list=(list)
//        notifyDataSetChanged()
//    }
//
//}
//
