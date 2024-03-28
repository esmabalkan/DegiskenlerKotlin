package AbstractveInterface

object Ogr{
// statik davranış gösterirler
    var sayac: Int=0

    fun SayaciGoster(){
        println("Sayac: " + sayac)
    }


}

fun main() {

   Ogr.sayac=85
    Ogr.SayaciGoster()



}