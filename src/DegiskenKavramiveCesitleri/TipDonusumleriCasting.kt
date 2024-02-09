package DegiskenKavramiveCesitleri

fun main() {

    var shortSayi : Short = 32767

    var intSayi : Int

    intSayi = shortSayi.toInt()
    println(intSayi)

    var intSayi2 : Int = 45000
    var shortSayi2 : Short
    shortSayi2 = intSayi2.toShort()
    println(shortSayi2)

    var ondalikliSayi : Double = 5959650.556677
    var ondalikliSayitoInt : Int
    ondalikliSayitoInt = ondalikliSayi.toInt()
    println(ondalikliSayitoInt)

}