package com.glosary.app.modules.explore6.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore10RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtA2MATEMilk: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_a2mate_milk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt05Ltr: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_5_ltr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)

)
