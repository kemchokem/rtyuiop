package com.glosary.app.modules.myaddresses.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class MyAddresses1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4517Washington: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4517_washington)

)
