package NesneYonelimliProgramlama

class Ogrenci (var isim:String, var yas: Int) {

    var gelenisim : String
    var gelenyas : Int

    init {
        this.gelenisim = isim
        this.gelenyas = yas
        println("İnit bloğu çalıştı")
        println("İsim : $isim Yas : $yas")
    }

    fun bilgilerimiGoster(){
        println("İsim: $gelenisim Yas: $gelenyas")
    }

}

fun main() {

    var ogr1:Ogrenci = Ogrenci("esma", 23)
    ogr1.bilgilerimiGoster()


}