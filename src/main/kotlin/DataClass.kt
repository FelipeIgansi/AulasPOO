fun main() {
    val f1 : FormaData= FormaData(10, 8)
    val f2 : FormaData= FormaData(10, 8)
    println(f1.equals(f2))
    println(f1.hashCode())
    println(f1.toString())
    println("------------")
    println(f2.hashCode())
    println(f2.toString())
}

class Forma (val a:Int, val b: Int){
    override fun equals(other: Any?): Boolean {
        return if (other is Forma)  {
            (other.a == this.a && other.b == this.b)
        }
        else {
            false
        }
    }
}
data class FormaData (val a:Int, val b: Int){}

/*
data class Endereco (val rua:String, val estado:String, val cep:String){}
fun endereco(e :Endereco){}*/
