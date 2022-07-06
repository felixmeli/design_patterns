package com.mercadolibre.android.nfc.designpatterns.behavior.command.commands

import android.util.Log
import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.Action
import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.TrackAction

class TrackCommand : Command {

    override fun execute(action: Action) {
        action as TrackAction
        Log.d("COMMAND", "Estoy trackeando el evento ${action.event}")
    }

}