package FonksiyonveMethod

fun main (){
   var toplam : Int = toplama(5,9)
    println("maindeki toplam deger: " + toplam)

    var gelenstring: String = sayHi("Esma Balkanova")
   // println(gelenstring)
    println(sayHi("Esma Balkanova"))

    var number : Int = readLine()!!.toInt()
   var hesaplananFaktoriyel : Int = faktoriyelHesapla(number)

    println(hesaplananFaktoriyel)
    println(faktoriyelHesapla(number))

}

fun toplama (sayi1:Int, sayi2:Int) : Int {
    var t : Int = sayi1 + sayi2

    println("Toplam fundaki toplama: " + t)

    return t

}

fun sayHi (name:String) : String{

    return "Merhaba " + name


}

fun faktoriyelHesapla(n:Int) : Int {

    var girilenSayi : Int = n
    var sayac = 1
    var faktoriyel=1

    while (sayac <= girilenSayi){

        faktoriyel=faktoriyel*sayac
        sayac++

    }
    return faktoriyel


}


/// kullanıcıdan aldığı sayının faktöriyelini hesaplayan methodu yaz.
