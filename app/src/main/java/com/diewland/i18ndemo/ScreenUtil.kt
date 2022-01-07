package com.diewland.i18ndemo

import android.app.Activity
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog

object ScreenUtil {

    fun openDialog(act: Activity) {
        val view = act.layoutInflater.inflate(R.layout.activity_main, null) as LinearLayout
        val builder = AlertDialog.Builder(act).setView(view)
        builder.create()
        builder.show()
    }

}