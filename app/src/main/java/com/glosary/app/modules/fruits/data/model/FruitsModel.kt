package com.glosary.app.modules.fruits.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class FruitsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFruits: String? = MyApp.getInstance().resources.getString(R.string.lbl_fruits)

)
