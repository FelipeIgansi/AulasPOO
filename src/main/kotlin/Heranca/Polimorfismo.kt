package Heranca

/*Normalmente se não vai ter uma lógica e atribuição de variaveis é usado a interface
* Mas se tiver essa necessidade ai sim é usado abstract
* Mas as duas formas funcionam
* Quando se usa interface não se instacia a classe quando se esta herdando, portanto não é usado o "()"*/
interface Funcionario{
    var salario : Float
    fun bonus(): Float
}
class Gerente(override var salario : Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(funcionario: Funcionario){
    println("O Bonus do $funcionario é ${funcionario.bonus()}")
}
fun main() {
    mostraBonus(Gerente(10000f))
    mostraBonus(Analista(5000f))
}