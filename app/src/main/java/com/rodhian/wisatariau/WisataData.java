package com.rodhian.wisatariau;

import java.util.ArrayList;

public class WisataData {
    private static String [] wisataName = {
        "Alamayang",
        "Wisata Pelangi",
        "Danau Kayangan",
        "Teluk Jering",
        "Nadhin",
        "Danau Raja",
        "Go Green",
        "Candi Muara Takus",
        "Istana Siak Sri Indrapura",
        "Ulu Kasok",
        "Hutan Raya Sultan Syarif Kasim",
        "Teluk Rhu Rupat"
    } ;

    private static String [] wisataDetail = {
        "Taman rekreasi masyarakat kota Pekanbaru, tempat memancing, outbound serta merupakan tempat bersantai bersama keluarga. Alam Mayang juga selalu dijadikan tempat melakukan acara outdoor, pengunjungnya juga datang dari luar daerah Kota Pekanbaru. Wisata Alam Mayang Pekanbaru merupakan salah satu wisata rekreasi andalan milik Kota Pekanbaru. Sama seperti Kebun Raya Bogor dan taman bermain lainnya, wisata Alam Mayang ini selalu ramai dikunjungi saat akhir pekan atau saat liburan tiba. Wisata Alam Mayang yang berada di pusat Kota Pekanbaru ini banyak menyediakan fasilitas hiburan untuk keluarga. Mengayunkan Langkah dan berjalan-jalan di sekitar Taman Wisata Alam Mayang, memang udara terasa begitu sejuk dan menyegarkan. Apalagi dengan adanya berbagai jenis pepohonan yang tumbuh dengan subur dan rindang yang mengelilingi areal objek wisata tersebut. Ini menjadi alasan utama bagi wisatawan untuk mengunjungi juga menikmati suasana alam yang masih begitu alami.",
        "Taman Agrowisata Pelangi. Untuk mencapai lokasi ini, sangatlah mudah. Hanya berjarak sekitar 13 kilometer dari pusat kota Pekanbaru. Berlokasi di Jalan Lintas Timur, Kulim, Kecamatan Tenayan Raya, kota Pekanbaru. Tidak jauh dari pasar Tangor. Taman ini sangat cocok jadi tempat rekreasi bersama keluarga ataupun orang tercinta. Ini lantaran suasananya yang banyak ditumbuhi pepohonan dan pondok-pondok kecil. Para travelers dapat memanfaatkan fasilitas yang tersedia di lokasi ini. Selain itu, berbagai macam warna yang menjadi hiasan di area ini dapat dijadikan sebagai spot berswafoto. Dan menariknya lagi, terdapat jembatan gantung yang mengelilingi taman ini. Dan pastinya ini akan memberikan kesan yang menarik.",
        "Danau Bandar Kayangan atau Danau Buatan merupakan salah satu destinasi wisata yang ada di Kota Pekanbaru. Letak Danau Bandar Kayangan atau Danau Buatan ini berada di Jalan Pramuka / Jalan Lingkar Danau Buatan, Kelurahan Lembah Sari, Kecamatan Rumbai Timur. Dari pusat Kota Pekanbaru, jarak menuju Danau Buatan atau Danau Bandar Kayangan ini membutuhkan waktu sekitar 20  menit. Akses jalan yang dapat dilalu untuk menuju Danau Bandar Kayangan ini, tribuners berada di Jalan Jendral Sudirman kemudian menuju arah utara dan melewati Jembatan Siak IV yang merupakan salah satu ikon di Kota Pekanbaru.",
        "Sungai Kampar yang berarus tenang pada suatu waktu meluap dan kepaknya membelah-belah daratan. Lahirlah daratan-daratan kecil di sela arus. Tanah lapang yang jadi bantaran akhirnya dibidik sebagai lokasi istirahat. Lama kelamaan keelokan tepian kian menggoda -menggamit sesiapa untuk menyaksikannya. Atas kejelian membidik prospek maka pariwisata akhirnya mengemuka. Jika dahulu lokasi hanya dinikmati penduduk lokal -maka kini ia telah berubah menjadi sebuah detinasi. Warga tempatan yang mulai menikmati dampak keekonomian atas kehadiran pelancong pada akhirnya kian sumringah dalam memelihara dan mengembangkan objek. Selain citra alami, keunggulan lain adalah soal lokasi yang sedemikian dekat dengan kota Pekanbaru. Mari sama menerbangkan imaji sembari menikmati sepotong senja di Pulau Cinta.",
        "Wisata agro Sungai pinang terletak di Desa Sungai Pinang, Kecamatan Tambang, Kabupaten Kampar, Provinsi Riau. wisata ini tergolong masih baru dan masih belum jadi sepenuhnya. setelah kabupaten kampar di hebohkan dengan wisata ulu kasok dan sekarang wisata kampar mulai terlihat di permukaan dengan berbagai wisata lainnya. disini terdapat berbagai permainan dan tempat berfoto yang dapat anda lakukan bersama keluarga anda atau teman-teman anda.",
        "Saat Anda berkunjung ke Kabupaten Indragiri Hulu akan terlihat keindahan alam yang sangat luar biasa. Masyarakat disana menyebutnya Danau Raja. Letak yang strategis membuat wisata Danau Raja banyak dikunjungi oleh wisatawan. Selain tempat pusat hiburan rakyat dan pusat kesenian melayu, Danau Raja pernah dijadikan arena MTQ tingkat provinsi. Dimana bangunan tilawah yang berbentuk perahu dibangun di atas permukaan air Danau Raja. Tentu hal ini membuat suasana Danau Raja lebih terlihat indah dan menarik untuk dikunjungi oleh para wisatawan.",
        "Wisata Go Green Agrowisata Sei Pinang terletak pada Desa Sungai Pinang, Kecamatan Tambang, Kapubaten Kampar, Provinsi Riau. Wisata Go Green ini memiliki konsep nuansa alam kehijauan yang enak di pandang. Wisata yang satu ini memiliki luas lokasi 55 hektar. banyak pengunjung yang merasa Wisata Taman Agro Nadin tempatnya sama dengan wisata Go Green. ada juga pengunjung yang pengen ke rumah terbalik atau wisata agro nadin namun mereka di arah kan ke lokasi go green. sebenarnya wisata ini tidak satu tempat, cuma wisata ini berada di desa yang sama dan kecamatan yang sama. jadi kalau anda mengunjungi wisata Go Green anda tidak akan melihat rumah terbalik yang di miliki wisata taman agro nadin. objek wisata GO green ini memiliki jembatan kecil yang dimana sekeliling jembatan di baluti oleh rumput hijau. semua yang ada disni banyak rumput warna hijau yang dimana berfungsi untuk mendapatkan udara segar sama seperti teman wisata ini adalah Go Green yaitu penghijauan.    ",
        "Candi Muara Takus adalah sebuah situs candi Buddha yang terletak di desa Muara Takus, Kecamatan XIII Koto, Kabupaten Kampar, Riau, Indonesia. Situs ini berjarak kurang lebih 135 kilometer dari Kota Pekanbaru. Situs Candi Muara Takus dikelilingi oleh tembok berukuran 74 x 74 meter, yang terbuat dari batu putih dengan tinggi tembok ± 80 cm, di luar arealnya terdapat pula tembok tanah berukuran 1,5 x 1,5 kilometer, mengelilingi kompleks ini sampal ke pinggir Sungai Kampar Kanan. Di dalam kompleks ini terdapat beberapa bangunan candi yang disebut dengan Candi sulung /tua, Candi Bungsu, Mahligai Stupa dan Palangka. Para pakar purbakala belum dapat menentukan secara pasti kapan situs candi ini didirikan. Ada yang mengatakan abad ke-4, ada yang mengatakan abad ke-7, abad ke-9 bahkan pada abad ke-11. Namun candi ini dianggap telah ada pada zaman keemasan Sriwijaya, sehingga beberapa sejarahwan menganggap kawasan ini merupakan salah satu pusat pemerintahan dari kerajaan Sriwijaya",
        "Istana Siak Sri indrapura adalah kediaman resmi Sultan Siak yang memiliki luas 32.000 meter. Istana ini sudah ada sejak tahun 1.723. Bentuk bangunan istana yang terdiri dari 2 lantai ini memiliki arsitektur bercorak Melayu, Arab, dan Eropa. Pada lantai bawah Anda dapat menemukan 6 ruangan yang difungsikan sebagai ruang tunggu tamu, ruang tamu kehormatan, ruang tamu laki-laki, ruang tamu perempuan, ruang siding kerajaan yang juga difungsikan sebagai ruang pesta. Sementara untuk lantai atas terdiri atas 9 ruangan yang berfungsi sebagai tempat istirahat Sultan serta para tamu istana. Di bagian halaman istana, Anda dapat menemukan 8 meriam yang tersebar di berbagai sisi halaman istana. Apabila Anda pergi ke bagian kiri belakang istana, Anda akan menemukan bangunan kecil yang dulunya digunakan sebagai penjara sementara. Selain itu, Anda juga dapat melihat sebuah koleksi peninggalan kerajaan berupa perahu kuno bernama “Kapal Kato“ yang dulunya digunakan Sultan untuk mengunjungi daerah-daerah kekuasaannya.",
        "Ulu Kasok yang terletak di Desa Pulau Gadang, Kecamatan XIII Koto Kampar, Kabupaten Kampar, Riau ini sesungguhnya bukanlah pulau sebagaimana Raja Ampat sungguhan. Sejatinya, Ulu Kasok adalah sebuah desa yang ditenggelamkan untuk membuat proyek Pembangkit Listrik Tenaga Air Kota Panjang. Hasilnya, bukit-bukit karang tampak menyembul layaknya sebuah pulau setelah lokasi tersebut dipenuhi oleh air yang digunakan untuk membuat danau buatan di daerah tersebut. Perbedaan ketinggian antara daerah berbukit dan lembah membuat wilayah ini muncul area-area yang dari jauh terlihat seperti pulau karang di Raja Ampat.",
        "Taman Hutan Raya Sultan Syarif Hasyim (disingkat menjadi Tahura SSH) adalah suatu kawasan hutan konservasi yang masuk dalam wilayah Kabupaten Kampar, Siak, dan Kota Pekanbaru di Provinsi Riau. Hutan konservasi ini ditetapkan sebagai kawasan pelestarian alam berdasarkan Surat Keputusan Menteri Kehutanan dan Perkebunan No.348/Kpts-II/1999 tanggal 26 Mei 1999 seluas 6.172 hektare, dengan perincian 3.041,81 hektare di Kabupaten Kampar, 2.323,33 hektare di Kabupaten Siak, dan 806,86 hektare di Kota Pekanbaru. Kawasan Tahura SSH juga merupakan objek wisata alam. Untuk mencapai kawasan tersebut dapat ditempuh dari ibu kota Provinsi Riau, Pekanbaru menuju Minas dengan jarak 25 km dan waktu tempuh sekitar 30 menit. Berbagai fasilitas umum tersedia di taman hutan raya, di antaranya kantor dan pesanggrahan, sarana ibadah, panggung kesenian, arena permainan anak-anak, gazebo, pendopo, jogging track, dan bumi perkemahan (camping gorund). Lebih dari 16 ribu anak tangga yang menghampar sepanjang delapan kilometer dengan ukuran rata-rata 0,50 meter, berada di tengah hutan di antara tempat-tempat ini.",
        "Teluk Rhu merupakan salah satu desa yang berada di Kecamatan Rupat Utara, Kabupaten Bengkalis, Provinsi Riau. Batas wilayah Teluk Rhu sebelah utara adalah Selat Malaka sebelah selatan adalah Titiakar sebelah timur adalah Tanjung Punak dan sebelah barat adalah Tanjung Medang. Teluk Rhu merupakan daerah yang memiliki banyak hasil alam berupa hasil perikanan, peternakan, pertanian tanaman pangan, tanaman apotik hidup dan sejenisnya. Selain hasil alam warga Teluk Rhu mempunyai perkebunan dan warga setempat juga memanfaatkan hasil alam dari hutan yang berupa arang. Teluk Rhu merupakan daerah yang memiliki cukup banyak penduduk dengan mata pencarian pokoknya adalah petani, Buruh Tani, PNS, Pedagang, Nelayan, Guru Swasta, Wiraswasta, Buruh harian dan sebagainya. Teluk Rhu merupakan daerah yang memiliki hasil bahan galian seperti Aluminium dan Pasir. Sumber daya air pada daerah ini sangant tinggi dengan jenis sumur gali, sumur pompa dan bak penampungan air hujan, alam yang sangat asri ini memiliki kualitas udara yang sangat baik. Teluk Rhu merupakan daerah dengan mayoritas penduduk beragama islam ",
    };

    private static int[] wisataImge = {
            R.drawable.alamayang,
            R.drawable.wisata_pelangi,
            R.drawable.danau_kayangan,
            R.drawable.telukjering,
            R.drawable.nadhin,
            R.drawable.danauraja,
            R.drawable.gogreen,
            R.drawable.candimuaratakus,
            R.drawable.istanasiak,
            R.drawable.ulukasok,
            R.drawable.hutansultan,
            R.drawable.teluk_rhu_rupat,
    };

    static ArrayList<Wisata> getlistData(){
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position <wisataName.length; position++){
            Wisata wisata = new Wisata();
            wisata.setNames(wisataName[position]);
            wisata.setDetail(wisataDetail[position]);
            wisata.setPhoto(wisataImge[position]);
            list.add(wisata);
        }
        return list;
    }
}
