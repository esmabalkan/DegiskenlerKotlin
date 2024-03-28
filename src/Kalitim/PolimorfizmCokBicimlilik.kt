package Kalitim

open class Asker{

  open fun SelamVer(){

        println("Asker selam verdi")
    }

}

class Er:Asker(){
    override fun SelamVer() {
        println("Er selam verdi")
    }

}

class Yuzbasi:Asker(){
    override fun SelamVer() {
        println("Yüzbaşı selam verdi")
    }

}

fun main() {

    var asker=Asker()
    var er=Er()
    var yuzbasi=Yuzbasi()

//    var asker2:Asker
//    asker2=Asker()
//    asker2=Er()
//    asker2=Yuzbasi()

    HazirOl(asker)
    HazirOl(er)
    HazirOl(yuzbasi)

}

fun HazirOl(asker:Asker){
    asker.SelamVer()
}