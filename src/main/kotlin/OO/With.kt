package OO

fun main() {
    val p = Pessoa("", "", "")
    p.acordar()
    p.dormir()


    //  Da para fazer isso tbm usando with

    with(p){// Com o objeto p faça: 
        acordar()
        dormir()
    }
}