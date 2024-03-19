package KontrolveDongu

fun main() {
    for(i in 1..10){
        println(i)

        if (i==7){ // 7den sonraki kısımda programı kes
            break
        }
    }


    for (harf : Char in "esmanurbalkan@gmail.com"){

        if (harf == '@') { // @ sonrasını yazdırma

            break
        }
        print("," + harf) // println ile karakterleri alt alta yazdırırken, print ile yan yana yazdırır. "," ile yazdırılan her karakterin yanına virgül koyabilirz.
    }

    println()
    var toplam = 0
    for (sayi in 1..10){

        if (sayi == 7)
            continue // bu sefer 7yi yazdırmadan döngüye devam etti

        if (sayi ==3)
            //return // sayı 3 olduğunda döngüden çıkıyor

        toplam += sayi


        println("Şuan ki sayı: "+ sayi)
        println("suanki toplam deger: " + toplam)
    }



  distakidongu@  for (i in 4..6){ // donguye isim verildi


        for (j in 1..3) {


            if (i*j == 12){
                break@distakidongu // isim verdiğimiz döngü şartı sağladıgı anda program bitti.
            }
            println("$i * $j: " +(i*j))

        }

    }










}