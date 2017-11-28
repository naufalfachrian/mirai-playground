package id.littleflower.itemdecoration.model

import java.text.SimpleDateFormat
import java.util.*

object ChatList {

    fun getList() : List<Chat> {
        val dateFormatter = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val chat01 = Chat("Hai, apa kabar?", dateFormatter.parse("2017-03-10"))
        val chat02 = Chat("Aku baik, kok. Bagaimana denganmu?", dateFormatter.parse("2017-03-10"))
        val chat03 = Chat("Sama sepertimu.", dateFormatter.parse("2017-03-10"))
        val chat04 = Chat("Hai, lama tidak bertukar kabar.", dateFormatter.parse("2017-05-28"))
        val chat05 = Chat("Iya nih. Apa kabar?", dateFormatter.parse("2017-05-28"))
        val chat06 = Chat("Aku lagi kecewa, nih. Ada kabar yang mengatakan kalau upah turun di tanggal 28. Tapi nyatanya? Huhuhu", dateFormatter.parse("2017-05-28"))
        val chat07 = Chat("Turun berduka, ya! Hahahahaha", dateFormatter.parse("2017-05-28"))
        val chat08 = Chat("Ih, kamu kok balasnya begitu, sih!", dateFormatter.parse("2017-05-28"))
        val chat09 = Chat("Hai, lagi apa nih?", dateFormatter.parse("2017-08-23"))
        val chat10 = Chat("Mau tahu banget, kah? Ra-ha-si-a.", dateFormatter.parse("2017-08-23"))
        val chat11 = Chat("Au ah elap", dateFormatter.parse("2017-08-23"))
        val chat12 = Chat("Eh, kita ketemuan, yuk! Aku ada bisnis, nih!", dateFormatter.parse("2017-10-04"))
        val chat13 = Chat("Serius? Ketemu di mana?", dateFormatter.parse("2017-10-04"))
        val chat14 = Chat("Di tempat seperti biasa, bagaimana?", dateFormatter.parse("2017-10-04"))
        val chat15 = Chat("Emang bisnis apa? Jangan-jangan bisnis 'ngegaet orang, ya?", dateFormatter.parse("2017-10-04"))
        val chat16 = Chat("Husss, kamu jangan negatif dulu. Aku jamin kamu bakal sukses di bisnis ini.", dateFormatter.parse("2017-10-04"))
        val chat17 = Chat("'Gak ah, baibai ~", dateFormatter.parse("2017-10-04"))
        return listOf(chat01, chat02, chat03, chat04, chat05, chat06, chat07, chat08, chat09,
                chat10, chat11, chat12, chat13, chat14, chat15, chat16, chat17)
    }

}