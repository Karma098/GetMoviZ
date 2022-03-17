package com.myapp.getmoviz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

@Suppress("DEPRECATION")
class bollywood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bollywood)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val bt1:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_tumbbad)
        val tumbbad = "http://103.222.20.150/ftpdata/Movies/Hollywood/2018/Tumbbad%20%282018%29/Tumbbad%20%282018%20%20AMZN%20WEB-DL%20.mkv"

        bt1.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(tumbbad))
            startActivity(intent)
        }

        val bt2:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_drishyam)
        val drishyam = "http://103.222.20.150/ftpdata/Movies/Bollywood/2015/Drishyam%20%282015%29%20BluRay/Drishyam.2015.1080p.BluRay.x264-%5BYTS.AM%5D.mp4"

        bt2.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(drishyam))
            startActivity(intent)
        }

        val bt3:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_airlift)
        val airlift = "http://103.222.20.150/ftpdata/Movies/Bollywood/2016/Airlift%20%282016%29%201080p/Airlift.2016.1080p.BRRip.x264.Hindi.AAC-ETRG.mp4"

        bt3.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(airlift))
            startActivity(intent)
        }

        val bt4:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_bbhai)
        val bbhai = "http://162.12.215.254/Data/Movies/Hindi/Old/Bajrangi%20Bhaijaan%20%282015%29%20Hindi%20720p%20HDRip/Bajrangi%20Bhaijaan%20%282015%29%20Hindi%20720p%20HDRip%20x264.mkv"

        bt4.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(bbhai))
            startActivity(intent)
        }
    }
}