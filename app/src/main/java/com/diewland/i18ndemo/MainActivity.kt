package com.diewland.i18ndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.diewland.i18ndemo.lang.LocaleHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val config = listOf (
            Pair(R.id.btn_lang1, "en"),
            Pair(R.id.btn_lang2, "th"),
        )

        config.forEach { (btn, lang) ->
            findViewById<Button>(btn).setOnClickListener { changeLang(lang) }
        }
    }

    private fun changeLang(langCode: String="en") {
        Log.d("LANG", "change language to $langCode")

        // change locale, effect to dialog immediately
        LocaleHelper.setLocale(this, langCode)

        // test by open dialog
        ScreenUtil.openDialog(this)

        // TODO update current screen text
    }

}