package Heranca

fun main() {
    Math.PI
    // Comportamento semelhante, mas em Kotlin
//    Matematica.PI
//    Matematica.PI
//    Matematica.PI
//    Matematica.PI
    Matematica.Constante.PI
    Matematica.Constante.PI
    Matematica.Constante.PI
    Matematica.Constante.PI
}

class Matematica {

    val PI = 3.1415 // Também pode ser feito, mas deixaria exposto para qualquer um mudar o valor
    companion object {// Compenion Object só existe 1
        val PI = 3.1415
        init {
            println("Fui inicializado")
        }
    }
    // Equivalente usando apenas o Object
    object /*tem que ter nome*/ Constante{
        val PI = 3.1415
        init {
            println("Fui inicializado")
        }
    }

}
