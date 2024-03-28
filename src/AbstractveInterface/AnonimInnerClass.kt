package AbstractveInterface

interface Okuyabilen{
    fun oku()
}

class Tarayici : Okuyabilen{
    override fun oku() {
        println("Tarayıcı sınıfından oku methodu tetiklendi")
    }

}

fun main() {
    var tarayici=Tarayici()
    tarayici.oku()

    var isimsizzSinif = object : Okuyabilen {

        override fun oku() {
            println("İsimsiz sinifindaki oku methodu tetiklendi")
        }
        
    }
    isimsizzSinif.oku()
}