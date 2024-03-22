package FonksiyonveMethod

import java.util.*

fun main() {

    fun yasimiGoster() = 23
    yasimiGoster()
    fun xxx(x:Int , y:Int) : Int = x+y
    xxx(x = 5, y = 10 )

    while (true) {

        var KullaniciSecimi = MenuGosterMethod()

        if (KullaniciSecimi == 5) {
            break
        }

        if (KullaniciSecimi in 1..4){
        println("Birinci sayıyı giriniz.")
        var sayi1:Int = readLine()!!.toInt()

        println("İkinci sayıyı giriniz.")
        var sayi2:Int = readLine()!!.toInt()


        when(KullaniciSecimi) {

            1 -> toplamaYap(sayi1, sayi2)
            2 -> cikarmaYap(sayi1, sayi2)
            3 -> carpmaYap(sayi1, sayi2)
            4 -> bolmeYap(sayi1, sayi2)
            else -> {
                println("Hatalı Giriş!")
                }
             }
        }
    }


}


fun toplamaYap(sayi1: Int, sayi2: Int) {

    println("Sayilarin Toplamı: " + (sayi1+sayi2))

}

fun cikarmaYap(sayi1: Int, sayi2: Int) {

    println("Sayıların Farkı: " +(sayi1-sayi2))
}

fun carpmaYap(sayi1: Int, sayi2: Int){
    println("Sayıların Çarpımı: " + (sayi1*sayi2))
}

fun bolmeYap(sayi1: Int,sayi2: Int){

    if (sayi2 != 0)
    println("Sayıların Bölümü: " +(sayi1/sayi2))
    else println("Bölen 0 olamaz")
}

fun MenuGosterMethod() : Int {

    var tarih = TarıhGoster()

    println("************************* MENU | $tarih ************************* ")
    println("1 - TOPLA")
    println("2 - FARK")
    println("3 - ÇARP")
    println("4 - BÖL")
    println("5 - ÇIKIŞ")
    println("Seciminiz: ")

    var secim =  readLine()!!.toInt()

    return secim

}

fun TarıhGoster(): String {

    val calendar = Calendar.getInstance()
    var saat = calendar.get(Calendar.HOUR)
    var dakika = calendar.get(Calendar.MINUTE)
    var saniye = calendar.get(Calendar.SECOND)

    return "$saat:$dakika:$saniye"


}
