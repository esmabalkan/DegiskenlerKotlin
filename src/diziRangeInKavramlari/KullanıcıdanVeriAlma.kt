package diziRangeInKavramlari

fun main() {

    println("İsmizi Giriniz: ")
    var İsim: String? = readLine()
    println("Soyisminizi Giriniz: ")
    var Soyisim : String = readLine() !!

    println("yaşınızı girin: ")
    var yas: Int = readLine()!!.toInt() // !! işaretini null değer gelebilceğini beklediğmiz yere koyuyoruz

    println("İsim :  ${İsim?.length} Soyisim: ${Soyisim.length} Yas: $yas ")
}