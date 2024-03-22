package FonksiyonveMethod

import java.util.Arrays

fun main() {
///// dizi kopyalama
//
//
//
//
//    var dizi1 = arrayOf(5,7,3,9,24,)
//    var dizi2 = Array<Int>(5){0}
//
//    System.arraycopy(dizi1,0,dizi2,0,5)
//    ////////// hangi diziden kopyalanacağı, hangi elemandan kopyalanmaya başlanacağı,
//    ////// hangi dizine kopyalancağı , kopyalama işlemi karşı tarafın kaçıncı elemanından başlayacak
//    //// bu dizinin kaç elemandan oluşacağını yazdık.
//
////
////    for (i in 0..dizi1.size-1){
////        dizi2[i]=dizi1[i]
////    }
//
//
///// dizi sıralama
//    for (sayi in dizi2){
//        println(sayi)
//    }
//    Arrays.sort(dizi2) /// bu kod düzensiz elemanları küçükten büyüğe sıralar
//
//    for (sayi in dizi2){
//        println(sayi)
//    }
//
//
///// dizi karşılaştırma
//
//    println(Arrays.equals(dizi1,dizi2)) // eğer bu iki dizinler birbirine eşitse true, değilse false değer döndürür.

    var isimler = arrayListOf("esma","ayşe","fatma")


    isimler.add("melek")
    isimler.add(0,"sevil") // 0.cı indexe yerleştirmesini söylediğimiz için
    // sonradan eklenmesine rağmen 0. indexte basar.

    for (isim in isimler){
        println(isim)
    }

    println(isimler.get(2)) // indexi 2 olan eleamnı getirir.
    println(isimler.size)
    println(isimler.remove("ayşe"))// listeden girdiğimiz elemanı siler
   // println(isimler.clear())// bütün listeyi siler
    isimler.set(0,"yeni deger")
println("* * * * * * * * * * * * * * *")

    for (isim in isimler){
        println(isim)
    }

}