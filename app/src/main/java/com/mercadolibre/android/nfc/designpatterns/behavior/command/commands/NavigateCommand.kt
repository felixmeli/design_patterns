package com.mercadolibre.android.nfc.designpatterns.behavior.command.commands

import android.util.Log
import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.Action
import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.NavigateAction

class NavigateCommand : Command {

    override fun execute(action: Action) {
        action as NavigateAction
        Log.d("COMMAND", "Estoy Navegando al deeplink ${action.deeplink}")
    }

}