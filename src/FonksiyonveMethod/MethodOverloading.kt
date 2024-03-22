package FonksiyonveMethod

fun main() {

    toplaminiBul(4,5)
    toplaminiBul(4,5,2)
    toplaminiBul(4.2, 5.3)
    toplaminiBul(1,2,3,4,5)

    var sayilarDizi = arrayOf(1,2,3,4,5,6,7,8,9,10)
    toplaminiBul(sayilarDizi)

    bilgileriGoster(23)
    bilgileriGoster("Esma Balkanova")

    // farkiniBul(5,9)

}

fun toplaminiBul(sayilarDizi: Array<Int>) {

    var toplam = 0
    for (sayi in sayilarDizi){
        toplam=toplam+sayi
    }
    println(toplam)

}

fun toplaminiBul (sayi1:Int, sayi2: Int){

    println(sayi1+sayi2)
}

fun toplaminiBul(sayi1:Double,sayi2: Double){
    println(sayi1+sayi2)
}


fun toplaminiBul(sayi1: Int,sayi2: Int,sayi3:Int){
    println(sayi1+sayi2+sayi3)
}

fun toplaminiBul(vararg sayilar:Int){

    var toplam = 0

    for(i in sayilar){
        toplam+=i
    }
    println(toplam)

}


//// deneme
fun bilgileriGoster( yas:Int){
    println(yas)
}
fun bilgileriGoster(ad:String){
    println(ad)
}


//// veri dönüş tipine göre method aşırı yüklemesi overloading yapılamaz.
//fun farkiniBul(sayi1: Int,sayi2: Int) : Int{
//    return sayi1 - sayi2
//}
//fun farkiniBul(sayi1: Int,sayi2: Int) : Unit{
//    println(sayi1-sayi2)
//}

