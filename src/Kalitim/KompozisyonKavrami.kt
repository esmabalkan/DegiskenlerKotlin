package Kalitim

class ArabaMotoru(){

    fun calis(){}
    fun dur(){}
}

class Pencere(){

    fun asagiCek(){}
    fun yukariCek(){}
}

class Kapi(){

    var pencere:Pencere= Pencere()

    fun ac(){}
    fun kapa(){}
}

class Tekerlek(){

    fun havaPompala(miktar:Int){}
}

class Araba{

    var arabaMotor=ArabaMotoru()
    var sagkapi:Kapi=Kapi()
    var solkapi:Kapi=Kapi()
    var tekerlekler: Array<Tekerlek> = Array(4){Tekerlek()}

}

fun main() {
    var arabam:Araba=Araba()
    arabam.sagkapi.pencere.asagiCek()
    arabam.solkapi.pencere.yukariCek()
    arabam.tekerlekler[0].havaPompala(50)
}