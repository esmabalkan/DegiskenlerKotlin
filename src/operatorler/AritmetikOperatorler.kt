package operatorler

fun main() {
        var sayi1: Int = 15
        var sayi2 = 3
        var sayi3 = 12
        var sayi4 = 7

        println("Sayilarin toplami = " + (sayi2 + sayi1 + sayi4+sayi3))
        println("Sayilarin farki = " + (sayi1 - sayi2 * sayi3-sayi4))
        println("Sayıların Farkı = $sayi1 - $sayi2") /// bunu bir metin olarak algıladı ve ekrana sonucu değil işlemi yazdırdı.
        println("Sayıların Farkı = ${sayi1 - sayi2}") /// daha kullanışlı bir başka ifade
        println("Sayilarin çarpimi = " + (sayi1*sayi2 / sayi4*sayi3))
        println("Sayilarin bölümü = " + (sayi1/sayi2 - sayi4 / sayi3))


        /////////// deneme
        println("Sayılarin Toplamı = ${sayi3 + sayi4}")
        println("Sayıların Farkı = ${sayi3 - sayi4}")
        println("Sayıların Çarpması = ${sayi4 * sayi3} ${sayi2* sayi1}")
        println("Sayıların Bölümü = ${sayi3 / sayi4}")


        ///// % mod almaya yarar. iki sayının bölümünden kalanı verir.
        println("sayi1 / sayi2 " + sayi1 % sayi4)
}