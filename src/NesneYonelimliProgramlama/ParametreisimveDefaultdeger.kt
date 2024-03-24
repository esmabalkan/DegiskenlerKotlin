package NesneYonelimliProgramlama

class dikdortgen(var en: Int = 0, var boy: Int = 0) { // default değeri 0 olarak karşımıza çıkar. yani en ve boy değerleri girilmezse otomatik olarak 0 atanır.

    fun alanHesapla() : Int{

        return this.en * this.boy

    }

}

fun main() {

    var d1:dikdortgen = dikdortgen(5,10)

    println(d1.alanHesapla())

    var d2:dikdortgen = dikdortgen(6,12)
    println(d2.alanHesapla())

    var d3 = dikdortgen(boy = 18, en = 8) // default olarak gelen ayarı manuel olarak ayarladık
    println(d3.alanHesapla())

    var en: Int = 5
    var d4:dikdortgen = dikdortgen(en)
    println("d4ün en değeri $en " + d4.alanHesapla())

}
