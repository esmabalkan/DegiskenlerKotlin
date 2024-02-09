package DegiskenKavramiveCesitleri

/// ad, soyad,yaş,boy, kilo, cinsiyet,



fun main() {

    /////////// değişken ataması ///////////////
    val name: String = "Esma" ///////// isim ve soyisim değişmez olduğu için val kullanıldı
    val surName: String = "Balkan"
    var age: Int = 23
    var height: Double= 1.65
    var weight: Double=68.1
    val gender: Char = 'K'

    /////////// boy kilo endex hesaplama
    var boyunKaresi : Double = height * height
    var boyKiloEndex : Double = weight / boyunKaresi
    println("Boy-Kilo Endeksiniz: "+ boyKiloEndex)




}