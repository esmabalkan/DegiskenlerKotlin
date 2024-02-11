package operatorler

fun main() {

    ///////////////// VE/AND (&&) Koşulu
    ////// VE/AND işleminde tüm koşullar true olmalı yoksa çıktı false döner.

    var sart1 = true
    var sart2 = true

    println(sart1 && sart2) // ikiside true, ve (&&) değişkeni olduğu için cevap true olarak döner.

    var sart3 = true
    var sart4 = false

    println(sart3 && sart4) // biri false olduğundan dolayı cevap false olarak döner.

    var sart5 = false
    var sart6 = false

    println(sart5 && sart6) //ikiside false olduğundan çıktı olarak false döner.


    //////// OR/VEYA Koşulu ( || )
    ////// Koşullardan biri sağlanırsa true döner.
    ///////// OR işleminde yalnızca tüm koşullar false ise çıktı olarak false döner.

    var sart7 = true
    var sart8 = false

    println(sart7 || sart8) /// sartların biri sağlandığı için true döner.


    //// NOT/DEĞİL Koşulu (!)

    var sart9 = true
    println(!sart9)
    var sart10 = false
    println(!sart10)



    //// ARTTIRMA VE AZALTMA
    /// ++ sayıyı 1 artırır.
    /// -- sayıyı 1 azaltır.

    var sayi = 15
    println(++sayi) // değişkene atadığımız sayıyı 1 arttırdı.
    /// Eğer değişkenin solundan arttırma işlemini yaparsak aşağıdaki kod satırına gerek kalmayabilir
    println(sayi) // yukarıda yaptığımız işlemi burada çıktısını aldık.
    ////// aşağıdaki işlemlerin hepsi değişkenin 1 arttırılmasına yarar.
    /// sayi = sayi+1
    /// sayi += 1
    /// sayi++

    //// deneme
    var sayi2 = 22
    println(sayi2--)
    println(sayi2)

    println(--sayi2)
    println(sayi2)


}