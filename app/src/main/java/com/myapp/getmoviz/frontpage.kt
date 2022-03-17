package com.myapp.getmoviz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.ViewFlipper

@Suppress("DEPRECATION")
class frontpage : AppCompatActivity() {

    lateinit var viewFlipper: ViewFlipper

    var image = intArrayOf(R.drawable.eot , R.drawable.inception ,R.drawable.spider, R.drawable.lucy ,R.drawable.pris, R.drawable.sh_island, R.drawable.shazam, R.drawable.xmen)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frontpage)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val bt_h:ImageButton=findViewById(R.id.ib_holly)
        val bt_b:ImageButton=findViewById(R.id.ib_bolly)

        bt_b.setOnClickListener {
            var intentb = Intent(this, bollywood::class.java)
            startActivity(intentb)
        }
        bt_h.setOnClickListener {
            var intenth = Intent(this, hollywood::class.java)
            startActivity(intenth)
        }

        viewFlipper = findViewById(R.id.vf_flipper)
//        val tv:TextView=findViewById(R.id.tv_download)
//        val url = "https://s30.speedostream.com/i7dmp7i6qxb7o2nqgcsfl3wunh26opkyjtgcwhy2t2hazr5r2rhprhsjtysq/Prmovies.com-Prisoners_Hindi_Dubbed.mp4"

//        tv.setOnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
//            startActivity(intent)
//        }

        for (i in 0 until image.size){
            flip_image(image[i])
        }
    }

    fun flip_image(i:Int){
        val view = ImageView(this)
        view.setBackgroundResource(i)
        viewFlipper.addView(view)
        viewFlipper.flipInterval = 3000
        viewFlipper.isAutoStart = true
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left)
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right)
    }
}