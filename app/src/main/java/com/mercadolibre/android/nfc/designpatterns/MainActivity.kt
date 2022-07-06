package com.mercadolibre.android.nfc.designpatterns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mercadolibre.android.nfc.designpatterns.behavior.command.CommandInvoker
import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.NavigateAction
import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.TrackAction
import com.mercadolibre.android.nfc.designpatterns.behavior.command.commandFactory.CommandFactoryImpl

class MainActivity : AppCompatActivity() {

    private lateinit var button: View

    private val initAction = TrackAction(event = EVENT_DATA_INIT)
    private val onclickActions = listOf(
        TrackAction(event = EVENT_DATA_CLICK),
        NavigateAction(deeplink = DEEPLINK)
    )

    private val commandFactory = CommandFactoryImpl()
    private val commandInvoker = CommandInvoker(commandFactory)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        commandInvoker.execute(initAction)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            commandInvoker.execute(onclickActions)
        }
    }

    companion object {
        const val EVENT_DATA_INIT = "El usuario llego a la pantalla"
        const val EVENT_DATA_CLICK = "El Usuario Hace click"
        const val DEEPLINK = "meli://nfc/nfc_payments"
    }
}