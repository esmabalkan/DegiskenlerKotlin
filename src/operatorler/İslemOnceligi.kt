package operatorler

fun main() {
    // 1. parantez içi her zaman en önce olarak işlem yapılır ()
    // 2. ++ ve -- eğer değişkenden önce gelirse ilk olarak bu işlem gerçekleşir (++sayi)
    // 3. öncelik ^ daha sonra üs alma işlemi gelir.
    // 4. öncelikli * ve / işlemidir
    // 5. öncelik + ve - işlemleridir.
    // 6. öncelik = (atama)
    // 7. ++ ve -- Değişkenden sonra bu işlemler yapılırsa en son önceliğe sahiptir. (sayi++)


    var sayi1 = 15
    var sayi2 = 5
    var sonuc : Int

    sonuc = (sayi1 + sayi2 * 2 - sayi2 ) + sayi2 - sayi1  * 5 + sayi2
    println(sonuc)


    //// ornek2

    sonuc = (sayi1 * sayi2 + 4 / 2) + sayi1++ * sayi2 // arttırma işlemi değişkenden sonra olduğu için sonuca etkisi olmaz.
    println(sonuc)


}