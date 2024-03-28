package Kalitim

open class Calisan {

    open var pozisyon:String="Çalışan"

  open fun calis(){

        println("$pozisyon çalışmaya başladı")

    }

}

open class Mudur: Calisan(){

    override var pozisyon:String= "Müdür"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

}

class GenelMudur() : Mudur(){
    override var pozisyon: String="Genel Müdür"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }
}

open class Programci: Calisan(){

    override var pozisyon:String= "Programcı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

}

class AnalizProgramcı : Programci (){

    override var pozisyon:String= "Analiz Programcı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }


}

class SistemProgramcisi : Programci(){

    override var pozisyon:String= "Sistem Programcısı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

    fun sistemiIncele(){
        println("Sistemi inceliyor")
    }


}

class Pazarlamaci: Calisan(){

    override var pozisyon:String= "Pazarlamacı"

    override fun calis() {
        println("$pozisyon çalışmaya başladı")
    }

}

fun <T> Array(size: T): Array<T> {
    TODO("Not yet implemented")
}

private operator fun Any.invoke(any: Any): Any {
    TODO("Not yet implemented")
}

private operator fun Any.set(i: Int, value: Calisan) {
    TODO("Not yet implemented")
}


fun main() {

    var calisanlar = arrayOf<Calisan>(

    Calisan(),
    Mudur(),
    Programci(),
    Pazarlamaci(),
    GenelMudur(),
    AnalizProgramcı(),
    SistemProgramcisi()
    )
      mesaiyeBasla(calisanlar)

//    var calisanlar = Array<Calisan>(Calisan())
//
//    calisanlar[0]=Calisan()
//    calisanlar[1]=Mudur()
//    calisanlar[2]=Programci()
//    calisanlar[3]=Pazarlamaci()
//


//    val Calisanlar =  String
//    mesaiyeBaslaPoliformiz(Calisanlar)

}

fun mesaiyeBaslaPoliformiz(Calisanlar:Array<Calisan>){

        for (oankiCalisan in Calisanlar){
            oankiCalisan.calis()

            if (oankiCalisan is SistemProgramcisi){
            oankiCalisan.sistemiIncele()
        }
    }


}

fun mesaiyeBasla(calisanlar: Array<Calisan>) {

    for (oankiCalisan in calisanlar ){
        oankiCalisan.calis()

//        if (oankiCalisan is Calisan ){
//            var calisan:Calisan=oankiCalisan
//            calisan.calis()
//        }else if(oankiCalisan is Mudur){
//
//            var mudur:Mudur=oankiCalisan
//            mudur.calis()
//        }else if (oankiCalisan is Programci){
//            var programci:Programci=oankiCalisan
//            programci.calis()
//        }else (oankiCalisan is Pazarlamaci){
//            var pazarlamaci:Pazarlamaci=oankiCalisan
//            pazarlamaci.calis()
//        }

    }

}


