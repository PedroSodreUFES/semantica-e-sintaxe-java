package je11_classes_essenciais;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
        // System.out
        System.out.print("Ola mundo!\n");
        System.out.println("Olá mundo!");

        // System.err
        System.err.println("Deu erro!");

        // System.in: pegar dados pelo console -> Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite sua idade: ");
        Integer idade = scanner.nextInt();
        System.out.println("Seu nome é: " + nome + " Sua idade é: " + idade);

        nome = null;
        idade = null;
        Double peso = null;
        String linhaArquivo = "Sodras;22;65.55";
        Scanner scan = new Scanner(linhaArquivo);
        scan.useDelimiter(";");

        int index = 0;
        while(scan.hasNext()){
            switch (index) {
                    case 0:
                        nome = scan.next();
                        break;
                    case 1:
                        idade = Integer.valueOf(scan.next());
                        break;
                    case 2:
                        peso = Double.valueOf(scan.next());
                        break;
            }
            index++;
        }

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu peso é: " + peso);

        // printf
        System.out.printf("\nprintf\nNome: %s\nIdade: %d\nPeso: %.2f\n", nome, idade, peso);

        // String builder
        StringBuilder sb = new StringBuilder();
        sb.append("Pedro");
        sb.append(" Sodré");
        System.out.println(sb);

        // Strings
        String name = "Pedro";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.split("")));

        // BigDecimal
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal resultado = zero.add(new BigDecimal("100"));
        resultado = resultado.multiply(new BigDecimal("20"));
        System.out.println(resultado);

        // Dízima
        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultado2 = BigDecimal.TEN.divide(divisor, 3, RoundingMode.HALF_EVEN);
        System.out.println(resultado2);

        // Arredondar
        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valor = litrosUtilizados.multiply(precoLitro);
        System.out.println(valor);
        BigDecimal valorArredondado = valor.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(valorArredondado);
    }
}
