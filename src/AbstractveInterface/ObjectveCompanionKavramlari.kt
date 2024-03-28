package AbstractveInterface

fun main() {

    JavaStaticKavrami.main(args = arrayOf())

    var test:JavaStaticKavrami=JavaStaticKavrami
    test.sinifAdi="Yeni sınıf"
    println(JavaStaticKavrami.sinifAdi)

    var test2:JavaStaticKavrami=JavaStaticKavrami

    test2.sinifAdi="Yeni sınıf test2"
    println(test2.sinifAdi)

    println(test.sinifAdi)

    var ogr1=OgrenciJava(9,"ayşe")


}


