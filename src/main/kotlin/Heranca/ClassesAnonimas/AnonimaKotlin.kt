package Heranca.ClassesAnonimas

interface Event{
    fun onSuccess()
}

class Program {
    fun salvar(e:Event){
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexões fechadas")
        e.onSuccess()
    }
}

fun main() {
    val p = Program()
    p.salvar(object : Event{// Equivalente no Kotlin para a chamada de uma classe anonima. Seria algo do tipo -> Cria um objeto(classe) que herda de Event
        override fun onSuccess() {
            println("on Success")
        }

    })
}