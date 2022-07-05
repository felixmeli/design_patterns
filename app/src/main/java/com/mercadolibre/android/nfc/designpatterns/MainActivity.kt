package com.mercadolibre.android.nfc.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var button: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

    }

    companion object {
        const val EVENT_DATA_INIT = "El usuario llego a la pantalla"
        const val EVENT_DATA_CLICK = "El Usuario Hace click"
        const val DEEPLINK = "meli://nfc/nfc_payments"
    }
}