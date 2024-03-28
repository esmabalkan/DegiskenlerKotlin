package AbstractveInterface
/*
abstract class Sporcu{

 abstract fun  sporYap()
}

open class buzPateni:Sporcu(){
    override fun sporYap() {
        println("Buz pateni yapıyor")
    }

}

open class Basketbol : Sporcu(){

    override fun sporYap() {
        println("Basketbol oynuyor")
    }
}

class Sportmenler: buzPateni(), Basketbol(){

    var sporcu:Sporcu=Sportmenler()

}

 */

interface BuzUstundeKayabilme {

    fun buzustundekay()
}

interface BasketAtabilme{
    fun basketAt()
}

class Sportmenler : BuzUstundeKayabilme, BasketAtabilme{
    override fun buzustundekay() {

    }

    override fun basketAt() {

    }

}