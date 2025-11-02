package je02_variavel;

public class Variavel {
    public static void main(String[] args) {
        final String BR = "Brasil";
        // código abaixo da erro pois final indica constante
        // BR = "Argentina";
        System.out.println(BR);

        String Pedro = "José";
        Pedro = "Pedro";
        System.out.println(Pedro);
    }
}
