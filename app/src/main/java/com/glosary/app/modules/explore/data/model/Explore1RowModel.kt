package com.glosary.app.modules.explore.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJaggeryPowder: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jaggery_powder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt500G: String? = MyApp.getInstance().resources.getString(R.string.lbl_500_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
