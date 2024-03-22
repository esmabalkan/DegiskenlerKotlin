package FonksiyonveMethod

import java.util.*

fun main() {

    var takim = "Beşiktaş"

    println(takim)
    println("Beşik" + "taş")
    println(takim.length)
    println(takim.get(0) + "" + takim.get(1))
    println(takim.substring(0,5)) // 0dan 5inci karaktere kadar ekrana basırır.
    println(takim)

    println(takim.indexOf('t')) // girilen harfin kaçıncı indekste olduğunu gösterir.
    println(takim.lastIndexOf('a')) // girdiğimiz harfin son gçtiği indeksi verir.
    println(takim.replace('B', 'P')) // girdiğimiz değerle önceki değeri değiştirerek ekrana bastırır.
    println(takim.toLowerCase()) // girilen bütün harfleri küçük yapar
    println(takim.toUpperCase()) // girilem bütün harfleri büyük yapar.




//    var ad = "Esma Balkanova"
//    var yas = "23"
//
//    println(ad + 1)
//    println(yas.toInt() + 1)
//    println("İsim: " + ad + "Yas : $yas")
//
//    for (tekKarakter in ad){
//        println(tekKarakter)
//    }
//
//    var okul = "bilecik"
//
//    for (i in 0..okul.length-1){
//        print(okul[i])
//    }
}