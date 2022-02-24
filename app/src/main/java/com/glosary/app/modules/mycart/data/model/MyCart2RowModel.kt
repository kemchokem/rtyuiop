package com.glosary.app.modules.mycart.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class MyCart2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFLAT: String? = MyApp.getInstance().resources.getString(R.string.lbl_flat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt50Off: String? = MyApp.getInstance().resources.getString(R.string.lbl_50_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOnYourFirstO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_on_your_first_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUseCouponCode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_coupon_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGETFIRST: String? = MyApp.getInstance().resources.getString(R.string.lbl_getfirst)

)
