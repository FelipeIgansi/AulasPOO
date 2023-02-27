package Heranca

open class AnimalEstimacao(var tipo: String){
    protected lateinit var nome: String
    open fun fazSom(){}
    open fun anda(qtnPatas: Int) {
        if (qtnPatas == 2){
            println("Anda em pé")
        }else if (qtnPatas == 4){
            println("Anda sob as 4 patas")
        }
    }
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
    override fun anda(qtnPatas: Int){
        correr()
        super.anda(qtnPatas)// exemplo não é bem o ideal, mas foi o que pensei para exemplificar o super
    }
    // Overload é quando vc tem o mesmo nome, mas comportamentos diferentes
    fun correr(){
    }
    private fun correr(patas:Int) {}
    private fun correr(patas:Float) {}
    private fun correr(patas:String) {}
}


fun main() {
    var c: caachorro = caachorro("Goldem")
    c.fazSom()
    c.darNome("Fredie")
    c.chamar()
}