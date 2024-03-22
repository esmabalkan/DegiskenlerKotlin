package FonksiyonveMethod


fun main() {
    isimYazdir()
    ismiParametreyleYazdir ("Esma Balkanova" , 23)
    menugoster()
}

fun ismiParametreyleYazdir(isim : String, yas:Int) {
    println(isim)
    println("Yaş: "+yas)

}

fun isimYazdir (){
    println("Esma Balkanova")
    println("23")
}


fun menugoster (){
    println("deneme")
    println("menu")
    println("1 +2")
    println("3+5")
}

