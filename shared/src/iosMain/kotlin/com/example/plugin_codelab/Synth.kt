package com.example.plugin_codelab

import cocoapods.MusicKeyboard.FLRSynthCreate
import cocoapods.MusicKeyboard.FLRSynthKeyDown
import cocoapods.MusicKeyboard.FLRSynthKeyUp
import cocoapods.MusicKeyboard.FLRSynthRef
import cocoapods.MusicKeyboard.FLRSynthStart
import kotlin.native.concurrent.freeze
import platform.Foundation.NSLog

actual class Synth {
    private val mSynth: FLRSynthRef? = FLRSynthCreate().freeze()
    private var mNumKeysDown = 0

    actual fun start() {
        NSLog("start:$mSynth")
        FLRSynthStart(mSynth)
    }

    actual fun keyDown(key: Int): Int {
        NSLog("keyDown:$key")
        FLRSynthKeyDown(mSynth, key)
        mNumKeysDown += 1
        return mNumKeysDown
    }

    actual fun keyUp(key: Int): Int {
        NSLog("keyUp:$key")
        FLRSynthKeyUp(mSynth, key)
        mNumKeysDown -= 1
        return mNumKeysDown
    }
}
