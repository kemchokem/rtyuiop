package com.glosary.app.modules.mysubscription.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityMySubscriptionBinding
import com.glosary.app.modules.mysubscription.`data`.model.MySubscription1RowModel
import com.glosary.app.modules.mysubscription.`data`.viewmodel.MySubscriptionVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class MySubscriptionActivity :
    BaseActivity<ActivityMySubscriptionBinding>(R.layout.activity_my_subscription) {
  private val viewModel: MySubscriptionVM by viewModels<MySubscriptionVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerMySubscriptionAdapter =
    RecyclerMySubscriptionAdapter(viewModel.recyclerMySubscriptionList.value?:mutableListOf())
    binding.recyclerMySubscription.adapter = recyclerMySubscriptionAdapter
    recyclerMySubscriptionAdapter.setOnItemClickListener(
    object : RecyclerMySubscriptionAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MySubscription1RowModel) {
        onClickRecyclerMySubscription(view, position, item)
      }
    }
    )
    viewModel.recyclerMySubscriptionList.observe(this) {
      recyclerMySubscriptionAdapter.updateData(it)
    }
    binding.mySubscriptionVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerMySubscription(
    view: View,
    position: Int,
    item: MySubscription1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "MY_SUBSCRIPTION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MySubscriptionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
