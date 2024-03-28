package DataClassGetterSetter

class Kisi(val id:Int, val isim:String){

//    override fun toString(): String {
//        return "id : $id isim : $isim"
//    }


}

data class KisiData(val id:Int, val isim:String){

}

fun main() {

    val esma=Kisi(1,"esma")
    val ayse=Kisi(2,"ayse")
    val esmaKopya=esma
    val test=Kisi(1,"esma")

    println(esma)
    println(esma.hashCode())
    println(esma.equals(ayse))
    println(esma.equals(esmaKopya))
    println(esma.equals(test))

    println("****************************************")

    val esmad=KisiData(1,"esma")
    val aysed=KisiData(2,"ayse")
    val esmaKopyaDatad=esmad
    val testd=KisiData(1,"esma")

    println(esmad)
    println(esmad.hashCode())
    println(esmad.equals(aysed))
    println(esmad.equals(esmaKopyaDatad))
    println(esmad.equals(testd))

    val kopyaAyse=aysed.copy()
    println("Kopya Ayşe: " + kopyaAyse)
    println("Kopya Ayşe id değişikliği" + aysed.copy(id = 85))

    var (id, isim)= esmad

    println("$id $isim")

}