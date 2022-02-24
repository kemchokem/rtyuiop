package com.glosary.app.modules.user.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class User1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_faq)

)
