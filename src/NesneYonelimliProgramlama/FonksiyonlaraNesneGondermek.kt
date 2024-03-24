package NesneYonelimliProgramlama

class Daire (var yaricap:Int) {}

fun main() {

    var daire1 : Daire = Daire (5)
    DaireAlaniniHesapla(daire1)

 //   println("Daire1'in alanı: " + (daire1.yaricap* daire1.yaricap * Math.PI))


    var daire2 : Daire = Daire (7)
    DaireAlaniniHesapla(daire2)

  //  println("Daire2'in alanı: " + (daire2.yaricap* daire2.yaricap * Math.PI))

    var daire3 : Daire = Daire(7)
    var daire4 : Daire = Daire(8)
    var daire5 : Daire = Daire(9)



    var daireler:Array<Daire> = Array<Daire>(5){Daire(0)}
    daireler[0] = daire1
    daireler[1]= daire2
    daireler[2]= daire3
    daireler[3]= daire4
    daireler[4]= daire5

    daireDizisiniGoster(daireler)

}

fun DaireAlaniniHesapla(daire: Daire){

    println("Dairenin Alanı: " + (daire.yaricap * daire.yaricap * Math.PI))


}

fun daireDizisiniGoster(DaireDizi : Array<Daire>){

    for (daire in DaireDizi){


        DaireAlaniniHesapla(daire)

    }

}