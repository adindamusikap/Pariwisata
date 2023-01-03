package com.example.pariwisata

object Wahana {
    private val NamaWahana  = arrayOf(
        "Kereta Misteri ",
        "Baling-Baling",
        "Paralayang",
        "Turbo Drop",
        "Zig Zag",
        "Hysteria",
        "Halilintar",
        "Kora-Kora",
        "Rumah Miring",
        "Istana Boneka",
        "Niagara",
        "Tornado"
    )
    private val WahanaDetails = arrayOf(
        "Wahana dalam ruang yang mengambil tema suasana Amerika diabad 19. Diakhir perjalanannya, pengunjung akan dikejutkan oleh sosok Serigala yang besar. Wahana ini berluaskan 5.000 m2 dan dilengkapi oleh 3 rangkaian kereta yang akan jalan bersamaan. Dimana per kereta memiliki kapasitas 20 orang.",
        "Baling – baling merupakan suatu wahana baru yang unik untuk kalangan “remaja” yang berada di kawasan Dunia Kartun. Ketinggian wahana ini mencapai 30 m yang akan menguncang adrenalin pengunjung dengan ayunan dan putaran ride 360 derajat",
        "Paralayang adalah salah satu wahana baru di kawasan Dunia Kartun, wahana keluarga ini mempunyai 14 seat, rasakan sensasi terbangnya",
        "Merupakan wahana keluarga yang dapat dinikmati oleh semua umur (termasuk anak). Wahana ini memberikan sensasi di hembuskan keatas setinggi 8 meter yang tidak hanya menyenangkan tapi juga aman untuk semua umur. ",
        "Zig – Zag merupakan wahana untuk “keluarga” yang terdiri dari beberapa mobil yang bertenaga listrik. Wahana ini dimainkan dengan mengarahkan mobil untuk menghindari mobil lainnya..",
        "Wahana Hysteria merupakan salah satu wahana yang memacu adrenalin sehingga banyak sekumpulan pengunjung remaja dan keluarga yang menguji adrenalin diantara sesama dengan menikmati wahana ini lebih dari sekali.",
        "Menjadi salah satu wahana favorit dan ekstrim di Dufan, wahana Halilintar mampu menguji adrenalin Anda untuk bukan hanya merasakan seluncuran dengan loop 360°, tapi juga lintasan turunan dan tanjakan yang tinggi dan cukup menikung. Berkapasitas 24 orang, wahana ini mampu membuat Anda serta kerabat dan teman-teman berteriak histeris untuk melupakan segala kejenuhan dari rutinitas sehari-hari.",
        "Wahana dengan bentuk kapal bajak laut ini perlahan lahan akan berayun, semakin lama ayunannya akan semakin tinggi hingga kemiringan 90 derajat. Jika dilihat dari kejauhan, wahana ini seperti akan melempar kapal laut ke atas sehingga terlihat akan lepas namun saat berada di kora-kora akan terasa sensasi seru dan ketagihan",
        "Wahana ini sama sekali tidak menggunakan mesin dan hanya mengandalkan konsep rekayasa rancang bangun yang akan memanipulasi indera manusia. Rumah Miring pertama kali dibangun di era tahun 30’an dan cukup populer hingga saat ini.",
        "Bangunan Istana Boneka ini berarsitektur gaya eropa klasik, dengan menggunakan perahu yang berjalan diatas air yang mengalir dengan arus yang tenang, kita dapat menjelajahi dan mengapresiasikan budaya etnik seluruh nusantara maupun kekhasan budaya diseluruh dunia dengan iringan lagu dan 600 boneka animatronik yang lucu. ",
        "Wahana Perahu Luncur / Niagara-gara, perahu berbentuk balok kayu yang meluncur bertualang mengikuti arus air kemudian pada klimaksnya naik setinggi 20 meter dan terjun seolah-olah mencebur mengikuti air terjun sungai-sungai Amerika.",
        "Wahana paling atraktif karena tidak hanya menegangkan tapi juga menghibur. Wahana ini merupakan kelas paling canggih dari jenis permainan Top Spin yang ada di dunia yang mana kedua lengan utamanya bisa bergerak secara bebas. Beroperasi sejak 2007 dan asal negara pembuatannya dari Italia dengan kapasitas sebesar 40 orang.",
    )
    private val WahanaImages = intArrayOf(
        R.drawable.keretamisteri,
        R.drawable.balingbaling,
        R.drawable.paralayang,
        R.drawable.turbodrop,
        R.drawable.zigzag,
        R.drawable.hysteria,
        R.drawable.halilintar,
        R.drawable.korakora,
        R.drawable.rumahmiring,
        R.drawable.istanaboneka,
        R.drawable.niagara,
        R.drawable.tornado,
    )
    val listData: ArrayList<permainan>
        get() {
            val list = arrayListOf<permainan>()
            for (position in NamaWahana.indices) {
                val Wahana = permainan()
                Wahana.name = NamaWahana[position]
                Wahana.detail = WahanaDetails[position]
                Wahana.photo = WahanaImages[position]
                list.add(Wahana)
            }
            return list
        }
}
