package je06_operadores;

public class Operadores {
    public static void main(String[] args) {
        // ternário
        Boolean maiorDeIdade = false;
        String message = (maiorDeIdade ? "É maior de idade!" : "Não é maior de idade!");
        System.out.println(message);

        Boolean c1 = true;
        Boolean c2 = false;
        System.out.println(c1 && c2);
        System.out.println(c1 || c2);
    }
}
