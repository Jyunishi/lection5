package com.example.lection5

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Handler
import android.os.IBinder
import android.widget.Toast

private const val DELAY_1MS = 1000L

class audioService : Service() {

    private var player: MediaPlayer = MediaPlayer.create(this,R.raw.beep)

    private lateinit var handler: Handler
    private lateinit var runnable: Runnable
    private var beepsCount = 0

    override fun onBind(intent: Intent): IBinder? = null

    override fun onCreate() {
        super.onCreate()

        Toast.makeText(this,"Beep service created!", Toast.LENGTH_LONG).show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this,"Beep is started!", Toast.LENGTH_LONG).show()

        handler = Handler(application.mainLooper)
        runnable = Runnable { startBeep() }

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()

    }

    private fun startBeep() {
        beepsCount++
        if(beepsCount > 3){
            stopSelf()
        }

        Toast.makeText(this, beepsCount.toString(), Toast.LENGTH_LONG).show()
//        player.start()
//        handler.postDelayed(runnable, DELAY_1MS)
    }
}