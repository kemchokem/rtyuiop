package com.glosary.app.modules.fruits.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityFruitsBinding
import com.glosary.app.modules.fruits.`data`.model.Fruits1RowModel
import com.glosary.app.modules.fruits.`data`.viewmodel.FruitsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class FruitsActivity : BaseActivity<ActivityFruitsBinding>(R.layout.activity_fruits) {
  private val viewModel: FruitsVM by viewModels<FruitsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerFruitsAdapter =
    RecyclerFruitsAdapter(viewModel.recyclerFruitsList.value?:mutableListOf())
    binding.recyclerFruits.adapter = recyclerFruitsAdapter
    recyclerFruitsAdapter.setOnItemClickListener(
    object : RecyclerFruitsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Fruits1RowModel) {
        onClickRecyclerFruits(view, position, item)
      }
    }
    )
    viewModel.recyclerFruitsList.observe(this) {
      recyclerFruitsAdapter.updateData(it)
    }
    binding.fruitsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerFruits(
    view: View,
    position: Int,
    item: Fruits1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "FRUITS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FruitsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
