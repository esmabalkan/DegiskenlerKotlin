package KontrolveDongu

fun main() {
    /*
    var yas : Int = 16
    if (yas > 18) {
        println("Ehliyet Alabilirsiniz")
    } else if (yas < 18 && yas > 15) {
        println("Az daha bekle")
    } else {
        println("Daha çok küçüksün")
    }
    println("Program Sonu")

     */

    println("Notunuzu giriniz: ")
    var NotDegeri: Int = readLine()!!.toInt()
    var donemnotu : Int = 0

   var sonuc : Any =   if (NotDegeri in 0..44) {
        println("Dersten kaldınız.")
        donemnotu = 1
        "f"
    } else if (NotDegeri in 45..54){
        println("dersten 2 aldınız.")
        donemnotu = 2
         "d"
    } else if (NotDegeri in 55..64){
        println("dersten 3 aldınız.")
        donemnotu = 3
        "c"
    }else if (NotDegeri in 65..74 ) {
        println("dersten 4 aldınız.")
        donemnotu = 4
        'b'
    }else if(NotDegeri in 75..100) {
        println("Dersten 5 aldınız tebrikler")
        donemnotu = 5
        "a"
    } else {
        println("Hatalı giriş.")

    }
    println("Ortalamana yansayacak notun: " + donemnotu)
    println("Sonuc = " + sonuc)




}
