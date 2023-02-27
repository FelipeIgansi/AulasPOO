package OO

fun main(args: Array<String>) {
    var pessoa = Pessoa()
    pessoa.nome = "Felipe"
    pessoa.sobrenome = "Maciel"
    pessoa.endereco = "Rua tal"
    println(pessoa.nome)
}

//Sintaxe da declaração de classe no kotlin
// class <nome da classe> constructor (parametros){corpo}
// palavra constructor no inicio é opcional
class Pessoa(
    var nome:String = "",
    var sobrenome:String = "",
    var endereco:String = ""
){
    //Sobreescrever construtor. Para fazer isso tem que passar o que o objeto pede no construtor
    constructor(nome:String, sobrenome:String, endereco:String, teste:String):
            this(nome = "", sobrenome = "", endereco = ""){

            }
    fun dormir(){

    }
    fun acordar(){

    }
}