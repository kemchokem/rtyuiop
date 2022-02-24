package com.glosary.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.glosary.app.R
import com.glosary.app.appcomponents.base.BaseActivity
import com.glosary.app.databinding.ActivityAppNavigationBinding
import com.glosary.app.modules.aboutus.ui.AboutUsActivity
import com.glosary.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.glosary.app.modules.contactus.ui.ContactUsActivity
import com.glosary.app.modules.correctmobilenumber.ui.CorrectMobileNumberActivity
import com.glosary.app.modules.correctotp.ui.CorrectOtpActivity
import com.glosary.app.modules.details.ui.DetailsActivity
import com.glosary.app.modules.explore.ui.ExploreActivity
import com.glosary.app.modules.explore6.ui.Explore6Activity
import com.glosary.app.modules.faq.ui.FaqActivity
import com.glosary.app.modules.fruits.ui.FruitsActivity
import com.glosary.app.modules.homescreen.ui.HomeScreenActivity
import com.glosary.app.modules.incorrectmobilenumber.ui.IncorrectMobileNumberActivity
import com.glosary.app.modules.incorrectotp.ui.IncorrectOtpActivity
import com.glosary.app.modules.loginwithmobile.ui.LoginWithMobileActivity
import com.glosary.app.modules.myaddresses.ui.MyAddressesActivity
import com.glosary.app.modules.mycart.ui.MyCartActivity
import com.glosary.app.modules.myorders.ui.MyOrdersActivity
import com.glosary.app.modules.mysubscription.ui.MySubscriptionActivity
import com.glosary.app.modules.mywallet.ui.MyWalletActivity
import com.glosary.app.modules.otpsent.ui.OtpSentActivity
import com.glosary.app.modules.payment.ui.PaymentActivity
import com.glosary.app.modules.privacypolicy.ui.PrivacyPolicyActivity
import com.glosary.app.modules.splash.ui.SplashActivity
import com.glosary.app.modules.termsofservices.ui.TermsOfServicesActivity
import com.glosary.app.modules.user.ui.UserActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearIncorrectOTP.setOnClickListener {
      val destIntent = IncorrectOtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFruits.setOnClickListener {
      val destIntent = FruitsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExplore1.setOnClickListener {
      val destIntent = Explore6Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPayment.setOnClickListener {
      val destIntent = PaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExplore.setOnClickListener {
      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyCart.setOnClickListener {
      val destIntent = MyCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIncorrectMobileNumber.setOnClickListener {
      val destIntent = IncorrectMobileNumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFAQ.setOnClickListener {
      val destIntent = FaqActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearContactUs.setOnClickListener {
      val destIntent = ContactUsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOTPSent.setOnClickListener {
      val destIntent = OtpSentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplash.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyAddresses.setOnClickListener {
      val destIntent = MyAddressesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeScreen.setOnClickListener {
      val destIntent = HomeScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyWallet.setOnClickListener {
      val destIntent = MyWalletActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPrivacyPolicy.setOnClickListener {
      val destIntent = PrivacyPolicyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetails.setOnClickListener {
      val destIntent = DetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCorrectOTP.setOnClickListener {
      val destIntent = CorrectOtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginWithMobile.setOnClickListener {
      val destIntent = LoginWithMobileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMySubscription.setOnClickListener {
      val destIntent = MySubscriptionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCorrectMobileNumber.setOnClickListener {
      val destIntent = CorrectMobileNumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAboutUs.setOnClickListener {
      val destIntent = AboutUsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearUser.setOnClickListener {
      val destIntent = UserActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTermsOfServices.setOnClickListener {
      val destIntent = TermsOfServicesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyOrders.setOnClickListener {
      val destIntent = MyOrdersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
