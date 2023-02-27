enum class Prioridade(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade Baixa: $value"
        }
    },
    Media(5){
        override fun toString(): String {
            return "Prioridade Média: $value"
        }
    },
    Alta(15){
        override fun toString(): String {
            return "Prioridade Alta: $value"
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
    /*    chamaPrioridade(Prioridade.Media)
        chamaTPConvite(tpConvite.Luxo)
        chamaCODConvite(codConvite.XL)*/
}