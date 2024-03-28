package AbstractveInterface

import AbstractveInterface.OgrenciJava

object JavaStaticKavrami {

    var sinifAdi="JavaStaticKavrami"

    @JvmStatic
    fun main(args: Array<String>) {
        val ogr1 = OgrenciJava(1, "Esma")
        ogr1.bilgileriYazdir()

        val ogr2 = OgrenciJava(2, "Ayşe")
        ogr2.bilgileriYazdir()

        val ogr3 = OgrenciJava(3, "Fatma")
        ogr3.bilgileriYazdir()


        println(OgrenciJava.toplamOgrenciSayisi)
        println(OgrenciJava.toplamOgrenciSayisi)
        println(OgrenciJava.toplamOgrenciSayisi)
        val ogr4 = OgrenciJava(4, "Hayriye")
        ogr4.bilgileriYazdir()
    }

    fun main() {
        TODO("Not yet implemented")
    }
}

internal class OgrenciJava(private val id: Int, private val isim: String) {
    init {
        toplamOgrenciSayisi++
    }

    fun bilgileriYazdir() {
        println("No: " + id + "İsim: " + isim + "Toplam ogrenci sayisi: " + toplamOgrenciSayisi)
    }

    companion object { // değişken methodlarımızı bunun içine yazarız. static değişkene denk gelir.
        var toplamOgrenciSayisi: Int = 0
    }
}
