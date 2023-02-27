package OO

enum class Prioridade(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "OO.Prioridade Baixa: $value"
        }
    },
    Media(5){
        override fun toString(): String {
            return "OO.Prioridade Média: $value"
        }
    },
    Alta(15){
        override fun toString(): String {
            return "OO.Prioridade Alta: $value"
        }
    }
}

fun chamaPrioridade(prioridade: Prioridade) {

}

enum class codConvite {
    XT, XL
}

enum class tpConvite {
    Comum, Luxo, Premium
}

fun chamaTPConvite(tp: tpConvite) {
    println(tp)
}

fun chamaCODConvite(cod: codConvite) {
    println(cod)

}

fun main() {
    for (p in Prioridade.values()) {
        println(p.value)
    }
    /*    OO.chamaPrioridade(OO.Prioridade.Media)
        OO.chamaTPConvite(OO.tpConvite.Luxo)
        OO.chamaCODConvite(OO.codConvite.XL)*/
}