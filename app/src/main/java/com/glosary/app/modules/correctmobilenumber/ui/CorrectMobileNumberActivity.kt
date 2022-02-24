package com.glosary.app.modules.correctmobilenumber.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityCorrectMobileNumberBinding
import com.glosary.app.modules.correctmobilenumber.`data`.viewmodel.CorrectMobileNumberVM
import kotlin.String
import kotlin.Unit

public class CorrectMobileNumberActivity :
    BaseActivity<ActivityCorrectMobileNumberBinding>(R.layout.activity_correct_mobile_number) {
  private val viewModel: CorrectMobileNumberVM by viewModels<CorrectMobileNumberVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.correctMobileNumberVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "CORRECT_MOBILE_NUMBER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CorrectMobileNumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
