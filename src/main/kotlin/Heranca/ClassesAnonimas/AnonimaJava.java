package Heranca.ClassesAnonimas;

class Programa {
    public void  calculo(Bonus bonus) {
        bonus.calcula();
    }

    public static void main(String[] args) {
        Programa p = new Programa();
        p.calculo(new Bonus() {// Instancia uma classe anonima que só "vive" no escopo que foi chamada, ou seja, é criada e morre entre na execução do calculo
            @Override
            public Float calcula() {
                return 500f;
            }
        });
    }
}
