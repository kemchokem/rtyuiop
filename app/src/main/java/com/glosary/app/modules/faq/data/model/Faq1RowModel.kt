package com.glosary.app.modules.faq.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class Faq1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhereDoYouDe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_where_do_you_de)

)
