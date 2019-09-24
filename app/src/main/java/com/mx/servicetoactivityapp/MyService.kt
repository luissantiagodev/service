package com.mx.servicetoactivityapp

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.support.v4.content.LocalBroadcastManager
import android.util.Log


/**
 * Created by Luis Santiago on 2019-09-23.
 */


class MyService : Service() {

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        //Aqui empezara la ejecución
        startDownloadingSong()
    }

    private fun startDownloadingSong() {
        Handler(Looper.getMainLooper()).postDelayed({
            Log.e("MY SERVICE" , "SONG DOWNLOADED")

            val intent = Intent("DOWNLOAD-SONG")
            intent.putExtra("nombre" , "Luis Santiago")
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent)

        } , 3000)
    }


}