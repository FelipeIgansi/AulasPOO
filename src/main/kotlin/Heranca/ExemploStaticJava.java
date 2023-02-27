package Heranca;

public class ExemploStaticJava {
    static int valor = 0;
    int value = 0;


    public ExemploStaticJava() {
        value++;
        valor++;
    }

    public static void main(String[] args) {
        new ExemploStaticJava();
        new ExemploStaticJava();
        new ExemploStaticJava();
        new ExemploStaticJava();
        new ExemploStaticJava();



        ExemploStaticJava ex = new ExemploStaticJava();
        System.out.println(ex.value);
        System.out.println(ExemploStaticJava.valor);

    }
}

