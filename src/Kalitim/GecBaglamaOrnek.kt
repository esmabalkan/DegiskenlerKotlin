package Kalitim


open class Hayvan{

    open fun AvYakala(){

        println("Hayvan av yakala çalıştı")
    }
}

class Kartal:Hayvan(){

    override fun AvYakala() {
        println("Kartal av yakala çalıştı")
    }
}

class Timsah:Hayvan(){

    override fun AvYakala() {
        println("Timsah av yakala çalıştı")
    }
}

fun main(){


   val hayvanlar = Array<Hayvan>(3) {

       rastgeleSec()

   }

        for (hayvan in hayvanlar){
            hayvan.AvYakala()
        }

    }





fun rastgeleSec(): Hayvan {

    val rastgeleSayi =  (Math.random() * 3).toInt()

    var oankiHayvan:Hayvan= Hayvan()

    when(rastgeleSayi){
        0 -> oankiHayvan=Hayvan()
        1 -> oankiHayvan=Kartal()
        else -> Timsah()

    }

    return oankiHayvan
}


