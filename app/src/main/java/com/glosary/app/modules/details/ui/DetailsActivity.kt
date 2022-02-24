package com.glosary.app.modules.details.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityDetailsBinding
import com.glosary.app.modules.details.`data`.model.Details1RowModel
import com.glosary.app.modules.details.`data`.viewmodel.DetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DetailsActivity : BaseActivity<ActivityDetailsBinding>(R.layout.activity_details) {
  private val viewModel: DetailsVM by viewModels<DetailsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerDetailsAdapter =
    RecyclerDetailsAdapter(viewModel.recyclerDetailsList.value?:mutableListOf())
    binding.recyclerDetails.adapter = recyclerDetailsAdapter
    recyclerDetailsAdapter.setOnItemClickListener(
    object : RecyclerDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Details1RowModel) {
        onClickRecyclerDetails(view, position, item)
      }
    }
    )
    viewModel.recyclerDetailsList.observe(this) {
      recyclerDetailsAdapter.updateData(it)
    }
    binding.detailsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerDetails(
    view: View,
    position: Int,
    item: Details1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "DETAILS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
