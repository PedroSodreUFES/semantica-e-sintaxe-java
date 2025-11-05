package je09_fluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Fluxo {
    public static void main(String[] args) {
        final String LETRA = "A";

        if (LETRA == "A") {
            System.out.println("A - if");
        } else if (LETRA == "B") {
            System.out.println("B - if");
        } else {
            System.out.println("Outra letra - if");
        }

        switch (LETRA) {
            case "A" : {
                System.out.println("A - switch");
                break;
            }
            case "B" : {
                System.out.println("B - switch");
                break;
            }
            default: {
                System.out.println("Outra letra - switch");
                break;
            }
        }

        for(int i = 0; i<5 ; i++){
            System.out.print(i + 1 + " Carneirinho");
            if(i != 0) {
                System.out.println("s");
            } else {
                System.out.print("\n");
            }
        }

        String alunos[] = {"Sodras", "Arthur", "Enrico"};
        // for loop
        for(int x=0; x < alunos.length ; x++) {
            System.out.println("O aluno da vez é: " + alunos[x] + " - primeiro for");
        }
        // for each
        for(String aluno: alunos) {
            System.out.println("O aluno da vez é: " + aluno + " - segundo for");
        }

        // while
        String alunin = "";
        int i =0;
        while(!alunin.equals("Enrico")){
            alunin = alunos[i];
            System.out.println("O aluno da vez é: " + alunin + " - while");
            i++;
        }

        // exceções
        try {
            Double valor = Double.valueOf("15");
            System.out.println(valor);
        } catch (NumberFormatException ex) {
            System.err.println("A STRING FORNECIDA NÃO É UM NÚMERO VÁLIDO!");
        }

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite sua altura: ");
            double altura= scanner.nextDouble();
            System.out.println("A sua altura é: " + altura);
            System.out.println("A sua idade é: " + idade);
        } catch (InputMismatchException ex) {
            System.err.println("1 - A altura talvez não foi fornecida em formato válido. Forneça num formato x.xx\n2 - A idade talvez deva ser um número inteiro.");
        }
    }
}

