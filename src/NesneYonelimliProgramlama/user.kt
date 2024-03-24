package NesneYonelimliProgramlama

class user(var id: Int, var name: String) {

    var adress:String = ""
    var mail:String = ""

   // var id : Int         yukarıda tanımladığımız için buraya ayrıyeten yazmamız gerekmez.
    //var name : String

    init {
      //  this.id=id
      //  this.name=name
        if (id < 0){
            id=1
        }
        println("id: $id  isim: $name")
    }

    constructor(id:Int,name: String,adress:String) : this(id,name){
        this.adress=adress
    }

   // constructor(id: Int,name: String,adress: String,mail:String) : this(id,name,){
        //this.mail=mail
    }



fun main() {

    var esma : user = user(100,"esma")

    var ayse : user = user(189543669, "ayse")

    var fatma : user = user(-5, "fatma", "bursa")

}