package com.glosary.app.modules.myorders.`data`.model

import com.glosary.app.R
import com.glosary.app.appcomponents.di.MyApp
import kotlin.String

public data class MyOrders1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDeliveredOn23: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivered_on_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGetInvoice: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_invoice)

)
