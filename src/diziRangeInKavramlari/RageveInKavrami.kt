package diziRangeInKavramlari

fun main() {
    /// 1 ile 50 arasındaki sayılar
    var sayilar: IntRange = 1..50
    var adanzye: CharRange ='a'..'z'

    var tersi = 20..2
    var harftersi = 'z'..'a'

    var birdenyirmiye : IntRange = 1.rangeTo(20)
    var OneToTwenty : IntRange = 1.rangeTo(20)
    var OneToTwentyReverse : IntProgression = 20.downTo(1)

    var ikiserİkiserSayilar : IntProgression = 0.rangeTo(100).step(2) // 0dan 100e kadar ikişer ikişer artmasını sağlayan kod
    var beserBeserSayilarReverse : IntProgression = 100.downTo(0).step(5) // 100den 0a kadar beşer beşer geriye saydıran kod

    var ElemanVarMi : Boolean = 11 in ikiserİkiserSayilar
    println("11 range içinde mi: " + ElemanVarMi) // false cevabı döner.

    println(beserBeserSayilarReverse.first) // ilk elemanı ekrana bastırır.
    println(beserBeserSayilarReverse.last) // son elemanı ekrana bastırır.
    println(beserBeserSayilarReverse.step) // kaçar kaçar artıyor/azalıyor onu gösterir.




    /////// deneme
    var Elemanvarmi : Boolean = 95 in beserBeserSayilarReverse
    println("95 range içinde mi: " + Elemanvarmi) // true gelir.
    println(ikiserİkiserSayilar.first)
    println(ikiserİkiserSayilar.last)
    println(ikiserİkiserSayilar.step)
}
