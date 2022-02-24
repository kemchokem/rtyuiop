package com.glosary.app.modules.myaddresses.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.glosary.app.modules.myaddresses.`data`.model.MyAddresses1RowModel
import com.glosary.app.modules.myaddresses.`data`.model.MyAddressesModel
import kotlin.collections.MutableList

public class MyAddressesVM : ViewModel() {
  public val myAddressesModel: MutableLiveData<MyAddressesModel> =
      MutableLiveData(MyAddressesModel())

  public var navArguments: Bundle? = null

  public val recyclerMyAddressesList: MutableLiveData<MutableList<MyAddresses1RowModel>> =
      MutableLiveData(mutableListOf())
}
