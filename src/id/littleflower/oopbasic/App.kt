package id.littleflower.oopbasic

import id.littleflower.oopbasic.components.*

fun main(args: Array<String>) {

    // --------------
    // 1. ABSTRACTION

    // Dalam contoh ini, Animal merupakan JVM interface. Salah satu contoh abstraksi.
    // Animal hanya mendeklarasikan method voice, voraType, dan viparType
    // Catatan : Karena penulis contoh ini kehabisan ide untuk menamai method yang berhubungan dengan cara
    //           berkembang biak dan tipe makanan yang bisa dimakan hewan, maka voraType merupakan istilah yang
    //           digunakan untuk tipe makanan yang bisa dimakan hewan (karnivora, omnivora, maupun herbivora)
    //           sementara viparType merupakan istilah yang digunakan untuk cara berkembang biak (vivipar,
    //           ovipar, ovovivipar)

    // Selain interface, abstract class juga merupakan contoh abstraksi.
    // Dalam contoh ini : Bird, Canis, Felidae, dan Mamalia merupakan abstract class.

    // Suatu objek (instance) tidak dapat dibuat langsung dari suatu abstraksi,
    // baik interface maupun abstract class.

    // Kode di bawah akan error!!
    // val animal = Animal()
    // val bird = Bird()
    // val mamalia = Mamalia()
    // val felidae = Felidae()
    // val domesticatedAnimal = Domesticated()

    // Tujuan abstraksi : mengurangi duplikasi kode dalam mendeklarasikan dan mendefinisikan kelas-kelas
    // yang memiliki banyak kemiripan.



    // ----------------
    // 2. ENCAPSULATION

    // Kakaktua merupakan burung yang bisa meniru suara manusia, apakah benar? Mengapa kakaktua bisa meniru
    // suara manusia? Tanyakan saja ke ahlinya.

    // Dalam contoh ini, encapsulation dicontohkan oleh kelas Cockatoo, yang memiliki "barang milik pribadi"
    // (private property) untuk menyimpan suara yang akan ditirunya.

    // Begitu diajak bicara, burung kakaktua pun langsung mencoba meniru suara tersebut.
    val cockatoo = Cockatoo()
    cockatoo.say("se se se se se se se le di fo ya laf")
    cockatoo.say("cu cu cu cu cu cu cu le di fo ya laf")

    // Tujuan encapsulation : memungkinkan untuk menambah spesifikasi dari kelas-kelas yang telah diabstraksi,
    // sekaligus menyembunyikan kerangka kerja yang tidak perlu diungkap.



    // --------------
    // 3. INHERITANCE

    // Mamalia adalah hewan yang berkembang biak dengan cara melahirkan. Dalam istilah biologi, disebut vivipar.
    // Kita tidak akan membahas biologi lebih lanjut di sini. Penulis bukan ahli biologi.

    // Dalam contoh ini, Giraffe merupakan subclass dari Mamalia.
    // Method viparType() tidak didefinisikan di kelas Giraffe, melainkan di kelas Mamalia.
    // Kelas Giraffe memiliki method viparType() warisan dari kelas Mamalia
    val giraffe = Giraffe()
    println("Jerapah berkembang biak dengan cara : " + giraffe.viparType())

    // Begitupun dengan kelas Felidae dan Canis, keduanya merupakan subclass dari Mamalia.
    // Sehingga secara otomatis, tanpa harus didefinisikan, kelas dan subclass Felidae dan Canis juga akan
    // menurunkan method viparType() dari kelas Mamalia

    // Kelas Cat merupakan subclass dari Felidae
    val cat = Cat()
    println("Kucing berkembang biak dengan cara : " + cat.viparType())

    // Kelas Wolf merupakan subclass dari Canis
    val wolf = Wolf()
    println("Serigala berkembang biak dengan cara : " + wolf.viparType())

    // Tujuan inheritance : mirip seperti tujuan abstraction, mengurangi duplikasi kode dalam mendeklarasikan dan
    // mendefinisikan method-method yang diturunkan dari superclass yang sama.



    // ---------------
    // 4. POLYMORPHISM

    // Hampir semua burung bisa terbang, bukan begitu? Namun, ada salah satu jenis burung yang tidak bisa terbang.
    // Burung jenis apakah itu? Jawabannya : Ayam! Ya, ayam tidak bisa terbang!
    // Kita hentikan lagi pembahasan biologinya di sini. Sekarang ayo kita bahas polymorphism.

    // Subclass dapat memodifikasi sifat-sifat yang diturunkan dari superclassnya merupakan akibat dari polymorphism.
    // Contoh polymorphism yang paling mudah ditemukan adalah menulis ulang (override) definisi dari suatu method
    // yang telah didefinisikan sebelumnya.
    // Dalam contoh ini, kelas Bird telah mendefinisikan method canFly, yang mengemablikan nilai (return value) true
    // Namun kelas Chicken, yang merupakan subclass dari Bird, memodifikasi method canFly sehingga mengemablikan nilai
    // false

    // Kelas Eagle merupakan subclass dari Bird
    val eagle = Eagle()
    println("Apakah burung elang bisa terbang? " + eagle.canFly())

    val chicken = Chicken()
    println("Apakah ayam bisa terbang? " + chicken.canFly())

    // Tujuan polymorphism : memungkinkan untuk mengubah spesifikasi yang telah didefinisikan sebelumnya oleh
    // superclass.

}
