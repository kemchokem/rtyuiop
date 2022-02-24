package com.glosary.app.modules.aboutus.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class AboutUs2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJaneCooper: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jane_cooper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFounder: String? = MyApp.getInstance().resources.getString(R.string.lbl_founder)

)
