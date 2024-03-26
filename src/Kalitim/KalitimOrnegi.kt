package Kalitim

open class Person ( isim:String, yas:Int , isGirl:Boolean){

    var isim:String
    open var yas:Int = 0
    var isGirl:Boolean


    init {
        println("person sınıfının initi tetiklendi")
        this.yas=yas
        this.isim=isim
        this.isGirl = isGirl
    }

    override fun toString(): String {

        var cinsiyet : String = if (isGirl) "kadın" else "erkek"
        return "isim:$isim yas:$yas cinsiyet $isGirl"
    }
}

class Ogretmen (  isim:String, override var yas:Int , isGirl:Boolean, brans:String): Person (isim, yas, isGirl){

    var brans:String

    init {
        println("Öğretmen sınıfının initi tetiklendi")

        if (yas < 0){
            yas = 999
        }

        this.brans = brans
    }

    override fun toString(): String {
        return super.toString() + "brans: $brans"
    }

}

fun main() {
    var p1 : Person = Person("Esma", 23, true)
    println(p1)

    var ogr1:Ogretmen=Ogretmen("ayse", -9, true, "ingilizce")
    println(ogr1)
}