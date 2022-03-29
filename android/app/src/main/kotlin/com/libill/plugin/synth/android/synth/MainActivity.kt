package com.libill.plugin.synth.android.synth

import android.os.Bundle
import com.example.plugin_codelab.PluginCodelabPlugin
import io.flutter.Log
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerWith(flutterEngine)
    }

    fun registerWith(flutterEngine: FlutterEngine?) {
        try {
            flutterEngine?.plugins?.add(PluginCodelabPlugin())
        } catch (e: Exception) {
            Log.e(
                "MainActivity",
                "Error registering plugin plugin_codelab, com.example.plugin_codelab.PluginCodelabPlugin",
                e
            )
        }
    }
}
