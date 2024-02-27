package diziRangeInKavramlari

fun main() {


    var sayilar : Array<Int> = arrayOf(0,1,2,3,4,5,6,7,8,9) /// int değerlerini tutar.

    println(sayilar[1])
    println(sayilar.get(6))
    println("Toplam eleman sayısı " + sayilar.size )

    var isimler : Array<String> = arrayOf("Ali", "Ayşe","Fatma", "Hasan", "Huseyin") // string değişkenleri tutar.
    println(isimler.get(1))
    println(isimler[0])

    var degiskenler : Array<Any> = arrayOf("ali", 5, false) // birden fazla değişken türünü tutar.
    println(degiskenler.get(2))

    var aylar : Array<String> = arrayOf("Ocak", "Subat", "Mart", "Nisan", "Mayıs", "Haziran", "Eylül","Ekim","Kasım",
        "Aralık")
    println(aylar.get(4))


//    /////////////// deneme
//    var a : CharArray = charArrayOf('z', 'e','h','r','a','n','u','r','b','a','l','c','i','k')
//
//    println(a[1])
//    println(a.get(0))
//    println("Toplam karakter sayısı " + a.size)
}