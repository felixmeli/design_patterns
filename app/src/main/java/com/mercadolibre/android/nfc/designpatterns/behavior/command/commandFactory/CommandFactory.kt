package com.mercadolibre.android.nfc.designpatterns.behavior.command.commandFactory

import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.Action
import com.mercadolibre.android.nfc.designpatterns.behavior.command.commands.Command

interface CommandFactory {
    fun getCommand(action: Action): Command?
}