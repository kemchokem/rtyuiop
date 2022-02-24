package com.glosary.app.modules.homescreen.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeScreen4RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSoftDrinks: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_soft_drinks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUpto40Off: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upto_40_off)

)
