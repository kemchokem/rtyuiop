package com.glosary.app.modules.payment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityPaymentBinding
import com.glosary.app.modules.payment.`data`.model.Payment1RowModel
import com.glosary.app.modules.payment.`data`.model.Payment2RowModel
import com.glosary.app.modules.payment.`data`.viewmodel.PaymentVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class PaymentActivity : BaseActivity<ActivityPaymentBinding>(R.layout.activity_payment) {
  private val viewModel: PaymentVM by viewModels<PaymentVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup654Adapter =
    RecyclerGroup654Adapter(viewModel.recyclerGroup654List.value?:mutableListOf())
    binding.recyclerGroup654.adapter = recyclerGroup654Adapter
    recyclerGroup654Adapter.setOnItemClickListener(
    object : RecyclerGroup654Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Payment1RowModel) {
        onClickRecyclerGroup654(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup654List.observe(this) {
      recyclerGroup654Adapter.updateData(it)
    }
    val recyclerGroup655Adapter =
    RecyclerGroup655Adapter(viewModel.recyclerGroup655List.value?:mutableListOf())
    binding.recyclerGroup655.adapter = recyclerGroup655Adapter
    recyclerGroup655Adapter.setOnItemClickListener(
    object : RecyclerGroup655Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Payment2RowModel) {
        onClickRecyclerGroup655(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup655List.observe(this) {
      recyclerGroup655Adapter.updateData(it)
    }
    binding.paymentVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup654(
    view: View,
    position: Int,
    item: Payment1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup655(
    view: View,
    position: Int,
    item: Payment2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PAYMENT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PaymentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
