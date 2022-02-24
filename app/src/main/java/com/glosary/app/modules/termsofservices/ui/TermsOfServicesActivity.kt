package com.glosary.app.modules.termsofservices.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityTermsOfServicesBinding
import com.glosary.app.modules.termsofservices.`data`.viewmodel.TermsOfServicesVM
import kotlin.String
import kotlin.Unit

public class TermsOfServicesActivity :
    BaseActivity<ActivityTermsOfServicesBinding>(R.layout.activity_terms_of_services) {
  private val viewModel: TermsOfServicesVM by viewModels<TermsOfServicesVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.termsOfServicesVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "TERMS_OF_SERVICES_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TermsOfServicesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
