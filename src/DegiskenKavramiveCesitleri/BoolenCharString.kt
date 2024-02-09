package DegiskenKavramiveCesitleri

fun main() {

    //// Boolean veri tipi karşılaştırmada kullanılır. True veya False çıktısı verir.

    var isTrue : Boolean = 15 < 18
    println("istrue değişkeninin değeri " + isTrue)

    //////////////// tek metinsel karakter tutar.

    var harf1 : Char = 'a'
    var harf2 : Char = 'b'
    println("İlk harf: \n " + harf1 + " \n ikinci harf: \n " + harf2)


    var name : String = "birden fazla isim yazıyomuş gibi"
    var surName : String = "ornek deneme olsun "
    println("Benim adım: " + name + " \n Benim soyadım: " + surName )
    println(name.length)
    println(surName.length)
    println(name.get(11))




}


