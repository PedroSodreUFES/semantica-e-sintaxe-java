package je03_identacao;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int media = 10;
        if (media < 6) {
            System.out.println("Reprovado!");
        }
        else if(media == 6) {
            System.out.println("Prova Minerva!");
        }
        else {
            System.out.println("Aprovado!");
        }

        for (int x = 1; x < 11 ; x++) {
            System.out.print("A nota tirada foi: ");
            System.out.println(x);
        }
    }
}
