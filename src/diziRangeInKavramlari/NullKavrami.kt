package diziRangeInKavramlari

fun main() {

    var isim : String? = null
    println(isim) // ekrana null bastırır. hata vermez.
    println(isim?.length) // ? koymadan değişkeni yazınca hata verir.
   // println(isim!!.length) // hata verir.


    var sayi : Int?
    sayi = 5
    println(sayi) // 5 yazdırır.

    sayi = null
    println(sayi) // null bastırır.
    println(sayi.toString().length)

    var onay : Boolean?
    onay = null
    println(onay.toString().length)
}