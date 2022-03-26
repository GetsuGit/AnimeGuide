package com.getsucode.animeguide.Repository

import com.getsucode.animeguide.Model.Character
import com.getsucode.animeguide.R
import java.util.*
import kotlin.collections.ArrayList

object CharacterData {
    private val characterNames = arrayOf(
        "Uzumaki Naruto",
        "Uchiha Sasuke",
        "Monkey D. Luffy",
        "Ichigo Kurosaki",
        "Sanji",
        "Roronoa Zoro",
        "Brooke",
        "Franky",
        "Trafalgar D. Water Law",
        "Ace"
    )

    private val characterDetail = arrayOf(
        "Naruto Uzumaki (渦巻 鳴門, Uzumaki Naruto) adalah shinobi dari Konohagakure. Dia menjadi jinchūriki dari Ekor Sembilan pada hari kelahirannya — sebuah nasib yang menyebabkan dia dijauhi oleh sebagian besar penduduk Konoha sepanjang masa kecilnya. Setelah bergabung dengan Tim Kakashi, Naruto bekerja keras untuk mendapatkan pengakuan desa sambil mengejar mimpinya untuk menjadi Hokage. Pada tahun-tahun berikutnya, melalui banyak kesulitan dan cobaan berat, ia menjadi ninja yang cakap yang dianggap sebagai pahlawan baik oleh penduduk desa, dan segera setelah itu, seluruh dunia, sehingga dikenal sebagai Pahlawan dari Konoha (木ノ葉隠れの英雄, Konohagakure no Eiyū; Secara harfiah berarti \"Hero of the Hidden Tree Leaves\"). Dia segera terbukti menjadi salah satu faktor utama dalam memenangkan Perang Dunia Shinobi Keempat, yang membawanya mencapai mimpinya dan menjadi Hokage Ketujuh (七代目火影, Nanadaime Hokage; Secara harfiah berarti \"Bayangan Api Ketujuh\").",
        "Sasuke Uchiha (団扇 佐助, Uchiha Sasuke) adalah salah satu anggota terakhir klan Uchiha yang masih bertahan dari Konohagakure. Setelah kakaknya, Itachi, membantai klan mereka, Sasuke berusaha mewujudkan misinya dalam rangka untuk membalas dendam dengan membunuh Itachi. Dia dimasukkan ke Tim 7 saat menjadi seorang ninja dan, melalui persaingan dengan rival dan sahabatnya, Naruto Uzumaki, Sasuke mulai mengembangkan keahliannya. Tidak puas dengan kemajuannya, ia pergi dari Konoha sehingga ia bisa memperoleh kekuatan yang dibutuhkan untuk membalas dendam. Tahun-tahunnya untuk membalas dendam menjadi semakin berat, tidak masuk akal dan mengasingkan dia dari orang lain, sehingga membuatnya menjadi penjahat internasional. Setelah membuktikan dirinya sebagai penolong dalam mengakhiri Perang Dunia Shinobi Keempat dan dengan senang hati dibebaskan oleh Naruto, Sasuke memutuskan untuk kembali ke Konoha dan mengabdikan hidupnya untuk membantu melindungi desa serta penduduknya.",
        "Monkey D. Luffy, juga dikenal sebagai \"Topi Jerami Luffy\" dan umumnya sebagai \"Topi Jerami\", adalah protagonis utama dari manga dan anime, One Piece. Dia adalah pendiri dan kapten Bajak Laut Topi Jerami yang semakin terkenal dan kuat, serta salah satu dari empat petarung top. Impian seumur hidupnya adalah menjadi Raja Bajak Laut dengan menemukan harta karun legendaris yang ditinggalkan oleh Raja Bajak Laut yang terlambat, Gol D. Roger. Dia percaya bahwa menjadi Raja Bajak Laut berarti memiliki kebebasan terbanyak di dunia. Setelah invasi Totto Land dan tindakannya melawan Yonko Big Mom, dia saat ini dianggap oleh pers global untuk menjadi Kaisar Kelima.\n" +
                "\n" +
                "Dia adalah putra dari pemimpin Revolusioner Monkey D. Dragon, cucu dari panglima marinir Monkey D. Garp, saudara angkat dari \"Tinju Api\" Portgas D. Ace dan Kepala Staf Revolusioner Sabo , dan putra angkat dari Curly Dadan.\n" +
                "\n" +
                "Luffy memiliki reputasi di seluruh dunia karena menyebabkan masalah, menantang Shichibukai, Marinir, dan Yonko, juga melakukan tindak kejahatan dan tindakan yang dianggap mengancam oleh Pemerintah Dunia. Lebih jauh, di sebagian besar konfrontasi ini, ia telah muncul sebagai pemenang. Dia telah mendapatkan reputasi sebagai \"ceroboh\" dan, dalam beberapa kasus, \"gila\", setelah menyebabkan insiden di Enies Lobby, menyerang World Noble di Sabaody Archipelago, masuk dan keluar dari Impel Down (sementara secara tidak langsung menyebabkan skala besar kerusuhan dalam proses), dan bergabung dengan Pertempuran Marineford. Karena itu, ia terkenal karena menjadi satu-satunya bajak laut yang diketahui untuk tidak hanya dengan sengaja menyerang tiga fasilitas pemerintah yang paling penting, tetapi juga melarikan diri dari semuanya hidup-hidup setelah menghadapi lawan-lawan yang sangat kuat di masing-masing. Fakta tambahan bahwa ia menekan Dunia Noble dengan pengetahuan penuh tentang konsekuensi, serta warisan nya, telah menyebabkan Luffy untuk diberi label sebagai \"Elemen Masa Depan Berbahaya\", mendapatkan murka Armada Laksamana Sakazuki dan Markas Angkatan Laut.\n" +
                "\n" +
                "Pada awal Reverie Arc, pencapaian Luffy dikompilasi, sangat menggembungkan keburukannya, yang sudah sangat besar untuk memulai. Ini termasuk hubungannya sebagai saudara yang disumpah untuk kedua almarhum komandan divisi kedua Bajak Laut Whitebeard dan putra Gol D. Roger, Portgas D. Ace, dan Kepala Staf Angkatan Darat Revolusioner, Sabo; armada yang secara tidak resmi terbentuk di bawahnya; operasi infiltrasi wilayah Big Mom, Totto Land, di mana ia mengalahkan Komandan Sweet Charlotte Cracker dan Charlotte Katakuri, berusaha melakukan pembunuhan terhadap Charlotte Linlin sendiri, menghancurkan kastilnya (secara tidak sengaja), dan menciptakan persekutuan yang cepat dengan Germa 66, Bajak Laut Matahari, dan Bajak Laut Fire Tank sebelum melarikan diri setelah pembunuhan gagal. Meskipun kemampuannya sedikit dibesar-besarkan oleh pers, prestasinya cukup besar baginya untuk secara tidak resmi berjudul \"Kaisar Laut Kelima\".\n" +
                "\n" +
                "Tindakan-tindakan ini, antara lain, telah memberinya bounty saat ini sebesar Berry.png1.500.000.000. Memiliki bounty Berry.png300.000.000 sebelum kedatangannya di Kepulauan Sabaody, Luffy adalah salah satu dari sebelas rookie bajak laut yang telah mencapai Jalur Merah, bajak laut dengan bounty lebih dari 100.000.000 yang akan terus disebut sebagai \"Generasi Terburuk\".",
        "Ichigo Kurosaki (黒崎 一護, Kurosaki Ichigo?) adalah karakter utama dari serial manga dan anime Bleach. Seri anime dan manga Bleach dimulai ketika Ichigo menerima daya shinigami karena bertemu dengan Rukia Kuchiki, seorang shinigami yang ditugaskan untuk mematroli Kota Karakura. Karena menyerahkan dayanya kepada Ichigo, Rukia tidak memiliki daya lagi, oleh karena itu, Ichigo ditugaskan untuk menggantikan tugas Rukia untuk dewa kematian untuk sementara saat. Ichigo mesti melindungi orang-orang dari arwah-arwah jahat yang dikata hollow, dan mengirim arwah-arwah berpihak kepada yang benar yang dikata plus ke Soul Society. Menurut jajak argumen popularitas karakter dari majalah Shonen Jump, karakter Ichigo selalu mendapat peringkat teratas untuk karakter sangat populer dalam manga Bleach.",
        "Vinsmoke Sanji (ヴィンスモーク・サンジ Vinsmoke Sanji) adalah seorang karakter fiksi dalam serial anime dan manga One Piece karya Eiichiro Oda. Ia merupakan anggota kelima di kelompoknya, serta orang keempat yang bergabung. Karena Sanji terlahir di North Blue, ia menjadi anggota Topi Jerami pertama yang tidak berasal dari East Blue. Ia memilki jumlah tebusan sebesar 77.000.000 Berry. Setelah Arc Dressrossa harga tebusan sanji naik menjadi 177.000.000 Berry. Dan setelah Arc Whole Cake Island naik kembali menjadi 330.000.000 Berry.",
        "Roronoa Zoro juga dikenal sebagai \"Pemburu Bajak Laut\" Zoro adalah seorang bajak laut dan ahli pedang dari kelompok Bajak Laut Topi Jerami dan merupakan salah satu karakter utama dalam cerita One Piece. Ia adalah orang pertama yang ditawari Monkey D. Luffy untuk bergabung dengannya. Impiannya adalah menjadi pendekar pedang nomor satu di dunia dengan mengalahkan Shichibukai Dracule Mihawk. Zoro termasuk ke dalam generasi bajak laut yang dilabeli sebagai \"Sebelas Supernova\", sebelas bajak laut rookie yang memiliki nilai bounty di atas Berry.png100.000.000 saat mencapai Red Line, dengan bounty sebesar Berry.png120.000.000. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote di Dressrosa, Zoro mendapat kenaikan bounty menjadi Berry.png 320.000.000",
        "Brook (ブルック Burukku) adalah seorang bajak laut dan musisi dari kelompok Bajak Laut Topi Jerami. Ia menjadi kru kesembilan yang bergabung setelah ditemukan tanpa sengaja di atas kapalnya yang karam di lautan misterius \"Segitiga Florian\". Impiannya adalah dapat bertemu Laboon kembali saat kru topi jerami selesai berlayar mengelilingi Grand Line. Ia berwujud seorang tengkorak yang hidup kembali berkat kekuasaan Buah Iblis miliknya \"Yomi Yomi no Mi\". Di atas kapal, Brook termasuk satu dari dua orang pendekar pedang selain Roronoa Zoro, dan memiliki nilai bounty sebesar Berry.png 33.000.000 saat baru bergabung. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote, Brook mendapat kenaikan bounty menjadi Berry.png 83.000.000.",
        "\"Cyborg\" Franky (\"鉄人\"フランキー \"Saibōgu\"\" Furankī?) adalah anggota kru Bajak Laut Topi Jerami yang bertugas sebagai mekanik kapal Thousand Sunny. Pertama kali muncul sebagai pemimpin Keluarga Franky, sebuah genk bawah tanah yang menguasai jalanan Water 7. Ia bernama asli \"Cutty Flam\" namun kemudian diganti karena permintaan Iceburg. Ia awalnya menjadi musuh kru topi jerami, namun berubah menjadi teman setelah perkembangan situasi memaksa mereka berbalik mendukung kru topi jerami. Setelah Franky mendapat bounty pertama, Keluarga Franky mendatangi kru topi jerami dan memohon agar merekrutnya. Ia menjadi anggota ke-8 kru topi jerami dan memiliki bounty sebesar Berry.png 44.000.000 setelah insiden di Enies Lobby. Setelah Bajak Laut Topi Jerami berhasil mengalahkan Keluarga Donquixote di Dressrosa, Franky mendapat kenaikan bounty menjadi Berry.png 94.000.000. Mimpinya adalah membuat sebuah kapal yang mampu mengarungi segala jenis lautan.",
        "Trafalgar D. Water Law adalah kapten sekaligus dokter Bajak Laut Jantung, merupakan salah satu bajak laut rookie yang di labeli sebagai Eleven Supernova dengan nilai bounty sebesar Berry.png 200.000.000. Ia berasal dari North Blue. Law berperan besar menyelamatkan hidup Luffy saat perang di Marineford. Setelah perang, ia menjadi Shichibukai yang baru setelah berhasil mempersembahkan 100 jantung para bajak laut kepada Pemerintah Dunia sekaligus meningkatkan nilai bounty nya menjadi Berry.png 440.000.000 sebelum akhirnya dibekukan. Ia memiliki kekuatan Buah Iblis Ope Ope no Mi yang memberinya kemampuan menciptakan sebuah ruang dan dapat mengontrolnya sesuka hati.",
        "Portgas D. Ace (ポートガス・D・エース Pōtogasu D. Ēsu), dikenal dengan julukan \"Tinju Api Ace\" (Hiken no Ace) adalah komandan Divisi ke-2 Bajak Laut Shirohige. Ia adalah anak kandung Raja Bajak Laut, Gol D. Roger dengan pasangannya Portgas D. Rouge, lalu diselamatkan diam-diam oleh Laksamana Madya Angkatan Laut Garp, kakek Luffy atas permintaan Roger.\n" +
                "Dalam pertempuran besar di Marineford, Portgas D. Ace akhirnya tewas ditangan Laksamana Akainu demi melindungi adiknya, Monkey D. Luffy."
    )

    private val characterImages = intArrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10
    )

    val listData: ArrayList<Character>
        get() {
            val list = arrayListOf<Character>()
            for (position in characterNames.indices) {
                val character = Character()
                character.name = characterNames[position]
                character.detail = characterDetail[position]
                character.image = characterImages[position]
                list.add(character)
            }
            return list
        }
}