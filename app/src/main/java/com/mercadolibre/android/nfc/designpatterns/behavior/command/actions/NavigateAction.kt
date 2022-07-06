package com.mercadolibre.android.nfc.designpatterns.behavior.command.actions

data class NavigateAction(
    val deeplink: String
) : Action(ActionType.NAVIGATE)