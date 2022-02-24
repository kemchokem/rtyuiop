package com.glosary.app.modules.details.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class Details1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPinapple: String? = MyApp.getInstance().resources.getString(R.string.lbl_pinapple)

)
