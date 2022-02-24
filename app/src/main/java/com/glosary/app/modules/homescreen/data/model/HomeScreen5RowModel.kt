package com.glosary.app.modules.homescreen.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeScreen5RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGranolaPremiu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_granola_premiu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2200: String? = MyApp.getInstance().resources.getString(R.string.lbl_22_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)

)
