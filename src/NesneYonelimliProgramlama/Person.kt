package NesneYonelimliProgramlama

class Person {
    var isim : String =  "esma"
    var yas : Int = 23

    fun selamVer(){
        println("Merhaba")
    }

    fun dogumYili() = 2024 - yas

}

fun main() {

    var kisi : Person = Person()

    println(kisi.isim)
    println(kisi.yas)
    kisi.selamVer()
    println(kisi.dogumYili())

    var kisi2 : Person = Person()
    kisi2.isim = "ayşe"
    var kisi3 : Person = Person()

}