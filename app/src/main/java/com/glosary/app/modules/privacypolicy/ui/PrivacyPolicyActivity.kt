package com.glosary.app.modules.privacypolicy.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityPrivacyPolicyBinding
import com.glosary.app.modules.privacypolicy.`data`.viewmodel.PrivacyPolicyVM
import kotlin.String
import kotlin.Unit

public class PrivacyPolicyActivity :
    BaseActivity<ActivityPrivacyPolicyBinding>(R.layout.activity_privacy_policy) {
  private val viewModel: PrivacyPolicyVM by viewModels<PrivacyPolicyVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.privacyPolicyVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "PRIVACY_POLICY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PrivacyPolicyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
