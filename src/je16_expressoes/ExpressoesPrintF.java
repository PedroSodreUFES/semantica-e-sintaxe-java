package je16_expressoes;

import java.time.LocalDate;

public class ExpressoesPrintF {
    public static void main(String[] args) {
        // formatar string
        Integer matricula = 55;
        Double salario = 1500.99;
        Integer idade = 22;
        String palavra1 = String.format("%d %.2f", idade, salario);
        System.out.println(palavra1);

        // Incluir string
        String nome = "Pedro";
        String sobrenome = "Sodré";
        String palavra2= String.format("%s %s", nome, sobrenome);
        System.out.println(palavra2);

        // mix
        String palavra3 = String.format("Salário: %.2f | Nome: %s %s | Idade: %d", salario, nome, sobrenome, idade);
        System.out.println(palavra3);

        // Mínimo 5 digitos
        String palavra4 = String.format("Matrícula: %05d", matricula);
        System.out.println(palavra4);

        // Tamanho - contendo no mínimo 50 caracteres - preenche com espaço à esquerda
        String palavra5 = String.format("%30s", nome+sobrenome);
        System.out.println(palavra5);

        // Tamanho - contendo no mínimo 50 caracteres - preenche com espaço à direita
        String palavra6 = String.format("%-30s", nome+sobrenome);
        System.out.println(palavra6);

        // Tamanho máximo de 5 caracteres
        String palavra7 = String.format("%.5s", nome + " " + sobrenome);
        System.out.println(palavra7);

        // Datas - dia/mes/ano
        LocalDate agora = LocalDate.now();
        String data = String.format("Data: %td/%tm/%ty", agora, agora, agora);
        System.out.println(data);

        // Passando por referência: anterior
        data = String.format("Data: %td/%<tm/%<ty", agora);
        System.out.println(data);

        // Ano com 4 dígitos
        data = String.format("Data: %td/%<tm/%<tY", agora);
        System.out.println(data);

        // Data toda de uma vez
        data = String.format("Data: %tD", agora);
        System.out.println(data);

        // Índice de argumento -> pega  parametro 1 sempre
        data = String.format("Data: %1$td/%1$tm/%1$tY", agora);
        System.out.println(data);

        // Mais um exemplo de por referência
        palavra1 = String.format("Minhas linguagens favoritas são %2$s e %3$s.\nMas estou aprendendo %4$s!", "Python", "Java Script", "C#", "Java");
        System.out.println(palavra1);
    }
}
