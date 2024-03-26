package Kalitim

 open class GeometrikSeil {

    var en:Int = 0
    var boy:Int = 0

  open fun AlanHeesapla(){

        println("Geometrik Şekil Alan : " + (en*boy))
    }

    override fun toString(): String {
        return "En $en Boy: $boy "
    }

}

class Kare : GeometrikSeil() {

    override fun AlanHeesapla() {

        println("Kare Alan : " + (en*boy))
    }


}

class Dikdortgen : GeometrikSeil () {

    override fun AlanHeesapla() {
        println("Dikdörtgen Alan : " + (en*boy))
    }
}

fun main() {

    var gsl = GeometrikSeil();
    gsl.boy = 6
    gsl.en = 3
    gsl.AlanHeesapla()


    var k1 = Kare()
    k1.boy = 6
    k1.en = 6
    k1.AlanHeesapla()

    var d1 = Dikdortgen()
    d1.en = 4
    d1.boy = 9
    d1.AlanHeesapla()
}