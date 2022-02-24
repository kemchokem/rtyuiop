package com.glosary.app.modules.mycart.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class MyCart1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShimlaApple: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shimla_apple)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt325: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
