package com.glosary.app.modules.faq.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class Faq2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatIsMinimum: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_minimum)

)
