package Heranca

abstract class Mamifero (val nome : String){
    fun acordar(){}
    fun dormir(){}

    // Basicamente estou criando um molde. Eu sei que nesse caso todos irão emitirSom, porem cada um sera um som diferente
    abstract fun emitirSom() // Se você tem algum elemento da classe como abstrato, toda a classe deve ser abstrata
    abstract fun seAlimentar()// Todas as funções abstratas devem ser sobrescritas
}
class Cachorro(nome: String): Mamifero(nome) {
    override fun emitirSom() {
        TODO("Not yet implemented")
    }

    override fun seAlimentar() {
        TODO("Not yet implemented")
    }
}