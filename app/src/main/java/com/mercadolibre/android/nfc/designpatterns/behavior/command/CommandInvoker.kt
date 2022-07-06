package com.mercadolibre.android.nfc.designpatterns.behavior.command

import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.Action
import com.mercadolibre.android.nfc.designpatterns.behavior.command.commandFactory.CommandFactory

class CommandInvoker(private val commandFactory: CommandFactory) {

    fun execute(action: Action?) {
        action?.let { commandFactory.getCommand(action)?.execute(action) }
    }

    fun execute(actions: List<Action>) = actions.forEach { execute(it) }

}