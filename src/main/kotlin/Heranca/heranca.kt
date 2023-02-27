package Heranca

open class AnimalEstimacao(var tipo: String){
    protected lateinit var nome: String
    open fun fazSom(){}
}
class caachorro(tipo: String):AnimalEstimacao(tipo){
    override fun fazSom(){
        println("au au")
    }
    fun darNome(nome: String){
        this.nome = nome
    }
    fun chamar(){
        println("Vem ${this.nome}")
    }
}


fun main() {
    var c: caachorro = caachorro("Goldem")
    c.fazSom()
    c.darNome("Fredie")
    c.chamar()
}