package Kalitim

open class Person2{

    var isim:String
    var yas:Int
    var isFemale:Boolean = false

    constructor(isim:String, yas:Int){
        this.isim=isim
        this.yas=yas
    }

    constructor(isim: String, yas: Int, isFemale:Boolean) : this(isim, yas){
        // kod tekrarını önler. iki parametre girilirse yukarısı tetiklenir. 3 parametre girilirse burası tetiklenir.
        this.isFemale=isFemale
    }

    override fun toString(): String {
        var gender = if (isFemale) "erkek" else "kadın"
        return "isim:$isim yas:$yas cinsiyet: $gender"
    }

   open  fun BilgileriGoster(): String {
        var gender = if (isFemale) "erkek" else "kadın"
        return "isim:$isim yas:$yas cinsiyet: $gender"
    }

}

class Ogretmen2:Person2 {

    var brans1: String

    constructor(isim: String, yas: Int, isFemale: Boolean, brans1: String) : super(isim, yas, isFemale) {

        this.brans1 = brans1

    }


    override fun toString(): String {
        return super.toString() + ", brans: $brans1"

    }

    override fun BilgileriGoster(): String {
        return super.BilgileriGoster() + "brans : $brans1"
    }

}

fun main() {
    var ornek2: Person2 = Person2("esma", 23, false)
    println(ornek2.toString())

    var ornek3: Person2 = Person2("ali", 43,)
    println(ornek3.toString())

    var ornek4: Ogretmen2 = Ogretmen2("mehmet", 45, true, "matematik")
    println(ornek4)
    println(ornek4.BilgileriGoster())
}