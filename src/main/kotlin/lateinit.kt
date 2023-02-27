class Receita {
    lateinit var instrucoes : String
    fun geraReceita(){
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita(){
        if (!this::instrucoes.isInitialized){// Verifica se um lateinit está inicializado
            instrucoes = "Lave as mãos."
        }
    }
}

fun main() {
    var r : Receita = Receita()
    println(r.instrucoes)

}