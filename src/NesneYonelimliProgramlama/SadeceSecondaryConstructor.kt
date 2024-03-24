package NesneYonelimliProgramlama

class SadeceSecondaryConstructor {
}

class Kare {

    var tekKenar : Int = 0

    constructor() {
        this.tekKenar = 0
    }




    fun KareninAlanihesapla () : Int {

        return tekKenar * tekKenar
    }

    constructor(kenar: Int) {
        this.tekKenar = kenar
    }



}


fun main() {
    var k1 = Kare()
    println("K1 alanı : " + k1.KareninAlanihesapla())

    var k2 = Kare(5)
    println("K2 alanı : " + k2.KareninAlanihesapla())


}

