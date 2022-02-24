package com.glosary.app.modules.payment.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosary.app.R
import com.glosary.app.databinding.RowPayment2Binding
import com.glosary.app.modules.payment.`data`.model.Payment2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup655Adapter(
  public var list: List<Payment2RowModel>
) : RecyclerView.Adapter<RecyclerGroup655Adapter.RowPayment2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPayment2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_payment2,parent,false)
    return RowPayment2VH(view)
  }

  public override fun onBindViewHolder(holder: RowPayment2VH, position: Int): Unit {
    val payment2RowModel = Payment2RowModel()
    // TODO uncomment following line after integration with data source
    // val payment2RowModel = list[position]
    holder.binding.payment2RowModel = payment2RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Payment2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Payment2RowModel
    ): Unit {
    }
  }

  public inner class RowPayment2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPayment2Binding = RowPayment2Binding.bind(itemView)
  }
}
