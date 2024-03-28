package GenericJenerikler

class StringDiziYaz{


    fun diziYazdir(dizi:Array<String>){

        for ( gecici in dizi ){

            println(gecici)

        }

    }

}

class IntegerDiziYaz{


    fun diziYazdir(dizi:Array<Int>){

        for ( gecici in dizi ){

            println(gecici)

        }

    }

}

class GenerikDiziYaz<Genel>(var dizi : Array<Genel>){

    fun diziYazdir(){

        for (gecici in dizi){
            println(gecici)
        }
    }



}

fun main() {
    var stringDizi = arrayOf("esma", "ayşe", "fatma")
    var integerDizi = arrayOf(1,2,3)

    var StringDiziYazSinif = StringDiziYaz()
    StringDiziYazSinif.diziYazdir(stringDizi)

    var integerDiziYazSinif = IntegerDiziYaz()
    integerDiziYazSinif.diziYazdir(integerDizi)

    var genericYazSinif=GenerikDiziYaz(stringDizi)
    genericYazSinif.diziYazdir()


}