package OO

class Animal(var especie : String) {
    private var somQueFaz : String = ""
        /*set(value) {
            field = value// field é como se fosse um this.variable evita chamada recursiva
        }*/
    // Getter e setter no kotlin é automaticamente gerado pelo kotlin
    init {
        // init seria uma execução padrão iniciou a classe já fará isso automaticamente
        somQueFaz = if (especie.lowercase() =="cachorro") {
            "au"
        } else if (especie.lowercase() == "gato") {
            "gato"
        } else {
            ""
        }
    }
    fun falar(){
        println(somQueFaz)
    }

}

fun main() {
    var a = Animal("Cachorro")
}