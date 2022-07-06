package com.mercadolibre.android.nfc.designpatterns.behavior.command.actions

data class TrackAction(
    val event: String
): Action(ActionType.TRACK)
