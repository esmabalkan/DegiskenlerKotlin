package diziRangeInKavramlari

fun main() {
    // 1. soru: kullanıcıdan iki sayı al ve aritmetik operatorleri uygula

    println("İlk sayıyı giriniz: ")
    var ilksayi : Int = readLine()!!.toInt()
    println("İkinci sayıyı giriniz: ")
    var sayi2 : Int = readLine()!!.toInt()

    println(" $ilksayi ve $sayi2 toplamı: " +(ilksayi + sayi2))
    println("$ilksayi ve $sayi2 farkı: " +(ilksayi - sayi2))
    println("$ilksayi ve $sayi2 bölümü: " +(ilksayi / sayi2))
    println("$ilksayi ve $sayi2 çarpımı: "+(ilksayi * sayi2))

  //3. soru islemin cıktısını yazdır.
    var cozum : Int = 2 + + 8 - - 2 + + 8 - - 2 + + 8
    // 2 + (+8) - (-2) + (+8) - (-2) + (+8) = 30
    println(cozum)

}