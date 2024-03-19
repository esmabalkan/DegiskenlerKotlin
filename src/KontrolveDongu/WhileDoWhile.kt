package KontrolveDongu

fun main() {
    for (i in 1..10){
        println(i)
    }

    var i : Int = 1

    while (i <= 10) {
        println(i)
       // i=i+1
        i++
    }

    ///while ile 1 ile 100 arasındaki tek sayıları yazdıran bi program yaz.
    var j : Int = 1
    while (j <= 100) {
        println(j)
        j = j+2
    }

    /// for ile 1 ile 100 arasındaki çift sayıların toplamını yazdıran kod yaz.
    var toplam = 0
    for (k in 1..100) {

        if (k % 2 == 0) {
            toplam = toplam + k
        }

    }

    println("Toplam: " + toplam)



    /// while ile 1 ile 100 arasındaki çift sayıların toplamı
    var number = 1
    var CiftSayiToplami = 0
    while (number <= 100) {
        if (number % 2 == 0) {
            CiftSayiToplami += number
        }
        number++
    }
    println("Whiledaki toplam sayılar: " + CiftSayiToplami)


    //// for ile 1-100 arasındaki tek sayıların toplamı
    var tektoplam = 0
    for (q in 1..100) {
        if (q % 2 == 1) {
            tektoplam = tektoplam + q
        }
    }
    println("Tek sayı toplamı: " + tektoplam)

    ///// while ile 1-100 arasındaki tek sayıların toplamı
    var sayi = 1
    var teksayitoplamı = 0
    while (sayi <= 100){
        if (sayi % 2 == 1){
            teksayitoplamı += sayi
        }
        sayi++
    }
    println("While Tek Sayi: "+ teksayitoplamı)


    ///////// While and DoWhile Farkı
    var e = 1

    while (e < 1){
        println(e)
        e++
    }
    println("While sonu ")

    var f = 1
    do {
        println("Do while çalıştı: "+f)
        f++
    }while (f<1)
















}