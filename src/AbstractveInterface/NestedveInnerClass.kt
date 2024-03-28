package AbstractveInterface

class DisSinif {

    var sinifAdi="Dış Sınıf"

    fun selamVerDisSinif(){
        println("Dış sınıftan mrhaba ")
    }



   inner class IcSinif{

        var sinifAdi="İç Sınıf"
        fun selamVerİcSinif(){
            selamVerDisSinif()
            println("İç sınıftan merhaba")
        }

     inner class EnictekiSinif{
           fun enictekisinifmethod(){
               selamVerDisSinif()
               selamVerİcSinif()
               println("En içteki sınıftan merhaba")
           }
       }
    }

}

fun main() {
    var DisSinif=DisSinif()
    println(DisSinif.sinifAdi)
    DisSinif.selamVerDisSinif()

  //  var icsinif=AbstractveInterface.DisSinif.IcSinif()
    var icsinif =DisSinif().IcSinif()
    println(icsinif.sinifAdi)
    icsinif.selamVerİcSinif()

    var enictekiSinif=AbstractveInterface.DisSinif().IcSinif().EnictekiSinif()
    enictekiSinif.enictekisinifmethod()
}
