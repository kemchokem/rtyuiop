package com.glosary.app.modules.explore6.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore9RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtStrawberry: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_strawberry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1Kg: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_kg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)

)
