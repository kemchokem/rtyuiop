package com.glosary.app.modules.loginwithmobile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityLoginWithMobileBinding
import com.glosary.app.modules.loginwithmobile.`data`.viewmodel.LoginWithMobileVM
import kotlin.String
import kotlin.Unit

public class LoginWithMobileActivity :
    BaseActivity<ActivityLoginWithMobileBinding>(R.layout.activity_login_with_mobile) {
  private val viewModel: LoginWithMobileVM by viewModels<LoginWithMobileVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.loginWithMobileVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "LOGIN_WITH_MOBILE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginWithMobileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
