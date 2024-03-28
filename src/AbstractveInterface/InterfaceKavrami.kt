package AbstractveInterface


interface Hayvan{ // interfaceler sınıf değildir

    fun avlan() // interfacelerde methodlarımız abstract v publictir
    fun interfaceTest(){ // final değildir publicdir başlarına open yazmaya gerek yoktur

        println("İnterface methodu ")
    }


}

abstract class Kedigiller : Hayvan{

    abstract fun takipEt()

}

open class Kedi : Kedigiller(){
    override fun takipEt() {
        println("Kedi sınıfı takip et çalıştı")
    }

    override fun avlan() {

    }

}

class Kaplan : Kedi(){
    override fun takipEt() {
        println("Kaplan sınıfı takip et çalıştı")
    }


    override fun avlan() {
        super.avlan()
    }
}

fun main() {
    //  var InterFace= Hayvan() ınterfacelerden nesne üretilemez.
    var h:Hayvan=Kaplan() // burda alt sınıflardan bağlama yaptık.
}