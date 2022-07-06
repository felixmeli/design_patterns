package com.mercadolibre.android.nfc.designpatterns.behavior.command.commands

import com.mercadolibre.android.nfc.designpatterns.behavior.command.actions.Action

interface Command {
    fun execute(action: Action)
}