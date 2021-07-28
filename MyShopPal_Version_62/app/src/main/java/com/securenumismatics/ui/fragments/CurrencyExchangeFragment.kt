package com.securenumismatics.ui.fragments


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.securenumismatics.R
import android.widget.Button as Button1


class CurrencyExchangeFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button1>(R.id.navigation_orders).setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("http://calc-currency.herokuapp.com")
            startActivity(openURL)
        }
    }
}