package com.example.ifpb

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val myIntent = Intent(context, MainActivity::class.java)
        context.startActivity(myIntent)
    }
}

