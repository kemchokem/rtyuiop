package com.glosary.app.modules.homescreen.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeScreen3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFortuneRice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fortune_rice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt37: String? = MyApp.getInstance().resources.getString(R.string.lbl_37)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOff: String? = MyApp.getInstance().resources.getString(R.string.lbl_off)

)
