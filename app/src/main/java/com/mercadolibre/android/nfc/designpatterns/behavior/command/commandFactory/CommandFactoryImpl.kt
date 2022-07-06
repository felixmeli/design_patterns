package com.mercadolibre.android.nfc.designpatterns.behavior.command.commandFactory

import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.Action
import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.NavigateAction
import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.TrackAction
import com.mercadolibre.android.nfc.designpatterns.behavior.command.commands.Command
import com.mercadolibre.android.nfc.designpatterns.behavior.command.commands.NavigateCommand
import com.mercadolibre.android.nfc.designpatterns.behavior.command.commands.TrackCommand

class CommandFactoryImpl : CommandFactory {

    override fun getCommand(action: Action): Command? =
        when (action) {
            is NavigateAction -> NavigateCommand()
            is TrackAction -> TrackCommand()
            else -> null
        }

}