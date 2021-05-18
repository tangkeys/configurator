package com.tangkeys.kbdcfg

import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class KeyboardConfigurator : Application() {
    override fun start(stage: Stage?) {
        stage?.scene = Scene(StackPane(Label(System.getProperty("java.version"))), 800.0, 600.0)
        stage?.show()
    }
}

fun main() {
    launch(KeyboardConfigurator::class.java)
}