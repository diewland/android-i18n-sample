package com.diewland.i18ndemo

import android.app.Activity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

object ScreenUtil {

    fun openDialog(act: Activity) {
        val view = act.layoutInflater.inflate(R.layout.activity_main, null) as LinearLayout
        val builder = AlertDialog.Builder(act).setView(view)
        builder.create()
        builder.show()
    }

    fun updateScreen(act: MainActivity) {
        // get screen objects
        val text1 = act.findViewById<TextView>(R.id.tv_text1)
        val text2 = act.findViewById<TextView>(R.id.tv_text2)
        val text3 = act.findViewById<TextView>(R.id.tv_text3)
        val btn1 = act.findViewById<TextView>(R.id.btn_lang1)
        val btn2 = act.findViewById<TextView>(R.id.btn_lang2)
        // update object text
        text1.text = act.getString(R.string.text_one) // locale string
        text2.text = act.getString(R.string.text_two) // locale string
        text3.text = act.getString(R.string.text_three) // locale string
        btn1.text = act.getString(R.string.btn_one) // locale string
        btn2.text = act.getString(R.string.btn_two) // locale string
    }

}