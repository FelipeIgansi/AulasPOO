package Heranca

abstract class abstrata
abstract class  interfaceAbstract
interface  interf1// Principal difença de classe abstrata e interface no Kotlin é que a innterface não pode ser instanciada e não guarda variaveis em memória
interface  interf2// Principal difença de classe abstrata e interface no Kotlin é que a innterface não pode ser instanciada e não guarda variaveis em memória

//class Teste: abstrata()       //Só pode haver uma herança, mas pode haver varias interfaces implementadadas
//class Teste: abstrata(), interfaceAbstract       //Só pode haver uma herança, mas pode haver varias interfaces implementadadas
class Teste: abstrata(), interf1, interf2//Só pode haver uma herança, mas pode haver varias interfaces implementadadas
