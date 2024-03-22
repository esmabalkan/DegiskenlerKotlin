package FonksiyonveMethod

fun main() {

    println(Math.E)
    println(Math.PI)
    println(Math.abs(-9)) // girilen sayının mutlak değeri
    println(Math.ceil(8.9))// girdiğimiz noktalı sayıyı üst sayıya yuvarlar
    println(Math.floor(7.5))// girdiğimiz noktalı sayıyı bir alt sayıya yuvarlar

    println(Math.pow(2.0,5.0))//2nin üssü 5 olarak ekrana bastırır.
    println(Math.pow(5.0,2.0))// 5in üssü 2 işlemini yapar

    println(Math.sqrt(81.0))// sayının kökünü bulur.
    println(Math.max(8,4))
    println(Math.min(8,4))

    println((Math.random() * 100).toInt()) // 0 ile 100 arasında rastgele bir sayı bastırır.

    // soru 1 : dik kenarları x olan ikizkenar üçgenin alanını bulunuz
    println("Üçgenin bir kenarını giriniz: ")
    var kenarUzunlugu = readLine()!!.toInt()
    var alan : Double = Math.pow(kenarUzunlugu.toDouble(), 2.0)/2

    println("Kenar Uzunluğu $kenarUzunlugu olan üçgenin alanı : " + alan)

    // soru 2: 0 ile 50 arasında rastgele üretilen sayıların önce büyüğünü sonra küçüğünü ekrana yazdır.

    var sayi1 : Int = (Math.random() * 50).toInt()
    var sayi2 : Int = (Math.random() * 50).toInt()

    println("Üretilen sayiların büyüğü : " + Math.max(sayi1,sayi2))
    println("Üretilen sayıların küçüğü : " + Math.min(sayi1,sayi2))


}

