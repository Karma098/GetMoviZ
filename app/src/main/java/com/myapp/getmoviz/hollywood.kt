package com.myapp.getmoviz


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

@Suppress("DEPRECATION")
class hollywood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hollywood)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        class showMovie(val button:androidx.appcompat.widget.AppCompatButton){
            fun playMovie(url:String){
                button.setOnClickListener {
                    var intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    startActivity(intent)
                }
            }
        }

        var a = arrayOf(showMovie(findViewById(R.id.bt_prisoner)), showMovie(findViewById(R.id.bt_NWH)), showMovie(findViewById(R.id.bt_joker)),
        showMovie(findViewById(R.id.bt_inception)), showMovie(findViewById(R.id.bt_shutter_island)), showMovie(findViewById(R.id.bt_eot)),
        showMovie(findViewById(R.id.bt_looper)), showMovie(findViewById(R.id.bt_lucy)), showMovie(findViewById(R.id.bt_shawshank_redemption)),
        showMovie(findViewById(R.id.bt_parasite)), showMovie(findViewById(R.id.bt_escape_room)), showMovie(findViewById(R.id.bt_matrix)),
        showMovie(findViewById(R.id.bt_mat_relo)), showMovie(findViewById(R.id.bt_mat_revo)), showMovie(findViewById(R.id.bt_signs)),
        showMovie(findViewById(R.id.bt_sixth)), showMovie(findViewById(R.id.bt_unbreakable)), showMovie(findViewById(R.id.bt_split)),
        showMovie(findViewById(R.id.bt_glass)), showMovie(findViewById(R.id.bt_searching)), showMovie(findViewById(R.id.bt_batman_begins)),
        showMovie(findViewById(R.id.bt_dark_knight)), showMovie(findViewById(R.id.bt_dark_rises)), showMovie(findViewById(R.id.bt_man_of_steel)))

        var link: Array<String> = arrayOf("http://vdomela.com/d_drive/English/Drama/Prisoners%20(2013)/Prisoners%20(2013).mp4",
            "https://dl.odcloud01.workers.dev/HollyWood/Spider-Man.No.Way.Home.2021.HDTV/Spider-Man.No.Way.Home.2021.720p.HDTC.HINDI.DUB-DudeFilms.in.mkv",
            "https://dl3.3rver.org/cdn2/05/film/2019/Joker/Joker.2019.BluRay.720p.mp4",
            "https://cdn-123.anonfiles.com/JbX7jdN5o3/4a94e35c-1645441688/Inception.(2010).720p.Dual.Audio.(Hin-Eng).[MoviesFlix].mkv",
            "https://dl3.3rver.org/cdn2/02/film/2010/Shutter%20Island/Shutter.Island.2010.720p.BluRay.Ganool.mkv",
            "http://167.114.174.132:9092/movies/Batch219/Edge%20of%20Tomorrow%20%282014%29/Edge%20of%20Tomorrow%20%282014%29.mp4",
            "http://162.12.215.254/Data/Movies/Dual%20Audio/2020/Looper%20%282012%29%20Dual%20Audio%20Hindi%20720p%20BluRay%20900MB/Looper%20%282012%29%20Dual%20Audio%20Hindi%20720p%20BluRay%20900MB%20ESub.mkv",
            "https://dl3.3rver.org/cdn2/05/film/2014/Lucy/Lucy.2014.720p.BrRip.YIFY.mp4",
            "https://dl3.3rver.org/cdn2/05/film/1994/The.Shawshank.Redemption/The.Shawshank.Redemption.1994.BluRay.720p.x264.YIFY.mp4",
            "http://ir2.papionvod.ir/Media/Movies/2019/Parasite%20%282019%29/Parasite%20%282019%29%20480p.mkv",
            "http://ir2.papionvod.ir/Media/Movies/2019/Escape%20Room%20%282019%29/Escape%20Room%20%282019%29%20480p.mkv",
            "http://ir2.papionvod.ir/Media/Movies/Dubbed/Collection/The%20Matrix/The_Matrix_%281999%29_720p.mkv",
            "http://ir2.papionvod.ir/Media/Movies/Dubbed/Collection/The%20Matrix/The_Matrix_Reloaded_%282003%29_720p.mkv",
            "http://ir2.papionvod.ir/Media/Movies/Dubbed/Collection/The%20Matrix/The_Matrix_Revolutions_%282003%29_720p.mkv",
            "http://103.152.18.18/Data/English/hollywood/2002/Signs%20%282002%29/Signs%20%282002%29.mp4",
            "https://dl3.3rver.org/hex2/Film/1399/02/The.Sixth.Sense.1999.720p.HexDL.com.mkv",
            "http://dl.jiocloud.link/Unbreakable.2000.720p.BrRip.Hindi-Eng.x264-KatmovieHD.Pw.mkv",
            "http://103.222.20.150/ftpdata/Movies/Hollywood/2016/Split%20%282016%29/Split.2016.HC.720p.HDRip.850.MB.-._BDPLEX.mp4",
            "http://ir2.papionvod.ir/Media/Movies/2019/Glass%20%282019%29/Glass%20%282019%29%20480p.mkv",
            "http://103.222.20.150/ftpdata/Movies/Hollywood/2018/Searching%20%282018%29/Searching%20%282018%29%20%5B1080p%5D%20HDRip.mp4",
            "https://dl3.3rver.org/cdn2/04/film/2005/batman.begins/Batman.Begins.2005.720p.mkv",
            "http://162.12.215.254/Data/Movies/Dual%20Audio/2020/The%20Dark%20Knight%202008%20IMAX%20Hindi%20ORG%20Dual%20Audio%20720p%20BluRay%201.1GB%20ESub/The%20Dark%20Knight%202008%20IMAX%20Hindi%20ORG%20Dual%20Audio%20720p%20BluRay%201.1GB%20ESub.mkv",
            "http://103.222.20.150/ftpdata/Movies/Hollywood/2012/The%20Dark%20Knight%20Rises%20%282012%29/The%20Dark%20Knight%20Rises%202012.mp4",
            "http://162.12.215.254/Data/Movies/Dual%20Audio/2020/Man%20Of%20Steel%20%282013%29%20Dual%20Audio%20Hindi%20720p%20BluRay%20x264/Man%20Of%20Steel%20%282013%29%20Dual%20Audio%20Hindi%20720p%20BluRay%20x264%20ESub.mkv")


        for((i,e) in link.withIndex()){
            a[i].playMovie(e)
        }


//        val bt1:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_prisoner)
//        val pris = "http://vdomela.com/d_drive/English/Drama/Prisoners%20(2013)/Prisoners%20(2013).mp4"
//
//        bt1.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(pris))
//            startActivity(intent)
//        }

//        val bt2:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_NWH)
//        val nwh = "https://dl.odcloud01.workers.dev/HollyWood/Spider-Man.No.Way.Home.2021.HDTV/Spider-Man.No.Way.Home.2021.720p.HDTC.HINDI.DUB-DudeFilms.in.mkv"
//
//        bt2.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(nwh))
//            startActivity(intent)
//        }

//        val bt3:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_joker)
//        val joker = "https://dl3.3rver.org/cdn2/05/film/2019/Joker/Joker.2019.BluRay.720p.mp4"
//
//        bt3.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(joker))
//            startActivity(intent)
//        }
//
//        val bt4:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_inception)
//        val incept = "https://cdn-123.anonfiles.com/JbX7jdN5o3/4a94e35c-1645441688/Inception.(2010).720p.Dual.Audio.(Hin-Eng).[MoviesFlix].mkv"
//
//        bt4.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(incept))
//            startActivity(intent)
//        }
//
//        val bt5:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_shutter_island)
//        val shut = "https://dl3.3rver.org/cdn2/02/film/2010/Shutter%20Island/Shutter.Island.2010.720p.BluRay.Ganool.mkv"
//
//        bt5.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(shut))
//            startActivity(intent)
//        }
//
//        val bt6:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_eot)
//        val eot = "http://167.114.174.132:9092/movies/Batch219/Edge%20of%20Tomorrow%20%282014%29/Edge%20of%20Tomorrow%20%282014%29.mp4"
//
//        bt6.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(eot))
//            startActivity(intent)
//        }
//
//        val bt7:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_looper)
//        val looper = "http://162.12.215.254/Data/Movies/Dual%20Audio/2020/Looper%20%282012%29%20Dual%20Audio%20Hindi%20720p%20BluRay%20900MB/Looper%20%282012%29%20Dual%20Audio%20Hindi%20720p%20BluRay%20900MB%20ESub.mkv"
//
//        bt7.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(looper))
//            startActivity(intent)
//        }
//
//        val bt8:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_lucy)
//        val lucy = "https://dl3.3rver.org/cdn2/05/film/2014/Lucy/Lucy.2014.720p.BrRip.YIFY.mp4"
//
//        bt8.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(lucy))
//            startActivity(intent)
//        }
//
//        val bt9:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_shawshank_redemption)
//        val shaw = "https://dl3.3rver.org/cdn2/05/film/1994/The.Shawshank.Redemption/The.Shawshank.Redemption.1994.BluRay.720p.x264.YIFY.mp4"
//
//        bt9.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(shaw))
//            startActivity(intent)
//        }
//
//        val bt10:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_parasite)
//        val parasite = "http://ir2.papionvod.ir/Media/Movies/2019/Parasite%20%282019%29/Parasite%20%282019%29%20480p.mkv"
//
//        bt10.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(parasite))
//            startActivity(intent)
//        }
//
//        val bt11:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_escape_room)
//        val esc = "http://ir2.papionvod.ir/Media/Movies/2019/Escape%20Room%20%282019%29/Escape%20Room%20%282019%29%20480p.mkv"
//
//        bt11.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(esc))
//            startActivity(intent)
//        }
//
//        val bt12:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_matrix)
//        val mat = "http://ir2.papionvod.ir/Media/Movies/Dubbed/Collection/The%20Matrix/The_Matrix_%281999%29_720p.mkv"
//
//        bt12.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(mat))
//            startActivity(intent)
//        }
//
//        val bt13:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_mat_relo)
//        val mat_relo = "http://ir2.papionvod.ir/Media/Movies/Dubbed/Collection/The%20Matrix/The_Matrix_Reloaded_%282003%29_720p.mkv"
//
//        bt13.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(mat_relo))
//            startActivity(intent)
//        }
//
//        val bt14:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_mat_revo)
//        val mat_revo = "http://ir2.papionvod.ir/Media/Movies/Dubbed/Collection/The%20Matrix/The_Matrix_Revolutions_%282003%29_720p.mkv"
//
//        bt14.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(mat_revo))
//            startActivity(intent)
//        }
//
//        val bt15:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_signs)
//        val signs = "http://103.152.18.18/Data/English/hollywood/2002/Signs%20%282002%29/Signs%20%282002%29.mp4"
//
//        bt15.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(signs))
//            startActivity(intent)
//        }
//
//        val bt16:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_sixth)
//        val sixth = "https://dl3.3rver.org/hex2/Film/1399/02/The.Sixth.Sense.1999.720p.HexDL.com.mkv"
//
//        bt16.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(sixth))
//            startActivity(intent)
//        }
//
//        val bt17:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_unbreakable)
//        val unbreak = "http://dl.jiocloud.link/Unbreakable.2000.720p.BrRip.Hindi-Eng.x264-KatmovieHD.Pw.mkv"
//
//        bt17.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(unbreak))
//            startActivity(intent)
//        }
//
//        val bt18:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_split)
//        val split = "http://103.222.20.150/ftpdata/Movies/Hollywood/2016/Split%20%282016%29/Split.2016.HC.720p.HDRip.850.MB.-._BDPLEX.mp4"
//
//        bt18.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(split))
//            startActivity(intent)
//        }
//
//        val bt19:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_glass)
//        val glass = "http://ir2.papionvod.ir/Media/Movies/2019/Glass%20%282019%29/Glass%20%282019%29%20480p.mkv"
//
//        bt19.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(glass))
//            startActivity(intent)
//        }
//
//        val bt20:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_searching)
//        val searching = "http://103.222.20.150/ftpdata/Movies/Hollywood/2018/Searching%20%282018%29/Searching%20%282018%29%20%5B1080p%5D%20HDRip.mp4"
//
//        bt20.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(searching))
//            startActivity(intent)
//        }
//
//        val bt21:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_batman_begins)
//        val batman_begin = "https://dl3.3rver.org/cdn2/04/film/2005/batman.begins/Batman.Begins.2005.720p.mkv"
//
//        bt21.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(batman_begin))
//            startActivity(intent)
//        }
//
//        val bt22:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_dark_knight)
//        val dark_knight = "http://162.12.215.254/Data/Movies/Dual%20Audio/2020/The%20Dark%20Knight%202008%20IMAX%20Hindi%20ORG%20Dual%20Audio%20720p%20BluRay%201.1GB%20ESub/The%20Dark%20Knight%202008%20IMAX%20Hindi%20ORG%20Dual%20Audio%20720p%20BluRay%201.1GB%20ESub.mkv"
//
//        bt22.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(dark_knight))
//            startActivity(intent)
//        }
//
//        val bt23:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_dark_rises)
//        val dark_rises = "http://103.222.20.150/ftpdata/Movies/Hollywood/2012/The%20Dark%20Knight%20Rises%20%282012%29/The%20Dark%20Knight%20Rises%202012.mp4"
//
//        bt23.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(dark_rises))
//            startActivity(intent)
//        }
//
//        val bt24:androidx.appcompat.widget.AppCompatButton=findViewById(R.id.bt_man_of_steel)
//        val man_of_steel = "http://162.12.215.254/Data/Movies/Dual%20Audio/2020/Man%20Of%20Steel%20%282013%29%20Dual%20Audio%20Hindi%20720p%20BluRay%20x264/Man%20Of%20Steel%20%282013%29%20Dual%20Audio%20Hindi%20720p%20BluRay%20x264%20ESub.mkv"
//
//        bt24.setOnClickListener {
//            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(man_of_steel))
//            startActivity(intent)
//        }
    }
}