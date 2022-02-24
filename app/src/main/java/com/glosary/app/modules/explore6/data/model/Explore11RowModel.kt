package com.glosary.app.modules.explore6.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore11RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtParleRusk: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_parle_rusk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt500G: String? = MyApp.getInstance().resources.getString(R.string.lbl_500_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
