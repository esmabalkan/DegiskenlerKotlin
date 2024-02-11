package operatorler

fun main() {
    var sayi = 5

    //// +=
    sayi += 5 /// sayi = sayi + 5 atanmış olur. değişkenimzin üzerine yazdığımız değeri ekler
    println("Sayinin ilk hali 5 son hali " + sayi)

    ////// -=

    sayi -= 2 /// yukarıdaki örnek gibi değişkenimizn üstünden atadığımız sayıyı çıkartır.
    println("Sayının ilk hali 5, son hali " + sayi) // yukarıdaki örnek kabul edildiği için 8 değeri döner.


    //// *=

    sayi *= 7 // atadığımız değeri ilk yukarıdaki sonuçla çarpar.
    println(sayi)


    //// /=

    sayi /= 6
    println(sayi) // yukarıda çıkan değerle atadığımız değeri böldü.

    //// %=
    sayi %= 3 /// sayi = sayi % 3 // 9un 3e bölümün modu
    println(sayi)


    ///// Karşılaştırma Operatörleri
    // < = Küçüktür
    // > = Büyüktür
    // >=  = Küçük Eşittir
    // <=  = Büyük Eşittir
    // ==  = eşittir
    // != = eşit değildir


    var sayi1 = 13
    var sayi2 = 7
    var sonuc : Boolean

    sonuc = sayi1 > sayi2 // true
    println(sonuc)

    sonuc = sayi1 < sayi2 // false
    println(sonuc)

    sonuc = sayi1 == sayi2 // false
    println(sonuc)

    sonuc = sayi1 != sayi2 // true
    println(sonuc)
}