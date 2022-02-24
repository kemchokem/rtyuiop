package com.glosary.app.modules.mycart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glosary.app.R
import com.glosary.app.databinding.RowMyCart2Binding
import com.glosary.app.modules.mycart.`data`.model.MyCart2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup259Adapter(
  public var list: List<MyCart2RowModel>
) : RecyclerView.Adapter<RecyclerGroup259Adapter.RowMyCart2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyCart2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_cart2,parent,false)
    return RowMyCart2VH(view)
  }

  public override fun onBindViewHolder(holder: RowMyCart2VH, position: Int): Unit {
    val myCart2RowModel = MyCart2RowModel()
    // TODO uncomment following line after integration with data source
    // val myCart2RowModel = list[position]
    holder.binding.myCart2RowModel = myCart2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MyCart2RowModel>): Unit {
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
      item: MyCart2RowModel
    ): Unit {
    }
  }

  public inner class RowMyCart2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowMyCart2Binding = RowMyCart2Binding.bind(itemView)
  }
}
