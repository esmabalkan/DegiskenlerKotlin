package FonksiyonveMethod

fun main() {

    var sayilarDizisi = Array<Int>(3){0}

    var kelimelerDizisi = Array<String>(10){""}

    for(i in 0..sayilarDizisi.size-1){

        sayilarDizisi[i]=i+10
        println(sayilarDizisi[i])
    }

    //// dizilerle çalışırken kaç elemanımız olacağını bilmek ve belirtmek zorundayız.

    var degiskenlerim  = arrayOf("esma", 2, true, 3.5)

    for (i in degiskenlerim){
        println(i)
    }

    degiskenlerim[0] = "esmanur"
    degiskenlerim[1] = 7
    degiskenlerim[2] = false
    degiskenlerim[3] = 0.5
  //  degiskenlerim[4] = 1 // yazarken herhangi bir hata vermez fakat çalıştırdığımız zaman hatayı ekrana bastırır. dizimizde olmayan bi index
    // tanımlanan dizinin elemanları içinde bu eleman yok.

    for (i in degiskenlerim){
        println(i)
    }

}