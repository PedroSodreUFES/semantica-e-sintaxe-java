package je13_manipulando_datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DataSemHora {
    public static void main(String[] args) {
        // LocalDate - aaaa-MM-dd - sem hora
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual); // aaaa-MM-dd ex:2025-11-30

        // Local Date via atribuição
        LocalDate meuAniversario = LocalDate.of(2003, 2, 18); // data específica
        System.out.println(meuAniversario);

        // Local date usando enum de mês
        LocalDate dataAleatoria = LocalDate.of(1001, Month.APRIL, 10); // enum mês
        System.out.println(dataAleatoria);

        // data vindo de string
        String a = "2025-11-07";
        LocalDate fromString = LocalDate.parse(a);
        System.out.println(fromString);

        // lidando com datas brasileiras
        String dataBrazilianFormat = "28/02/2000";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDoBrasil = LocalDate.parse(dataBrazilianFormat, formatter);
        System.out.println(dataDoBrasil);

        // Manipular datas
        LocalDate nasceuVk = LocalDate.of(2011, 2, 4);
        LocalDate niverDe15DoVkzin = nasceuVk.plusYears(15);
        System.out.println(niverDe15DoVkzin);

        // Amanhã
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje + "\nAmanhã: " + hoje.plusDays(1));
        // Ontem
        System.out.println("Hoje: " + hoje + "\nOntem: " + hoje.plusDays(-1));

        // Comparação de datas
        LocalDate data1 = LocalDate.of(2023, 3, 4);
        LocalDate data2 = LocalDate.of(2024, 4, 3);
        System.out.println(data2.isAfter(data1));
        System.out.println(data2.isEqual(data1));
        System.out.println(data2.isBefore(data1));

        // Formatar saída
        System.out.println("Sem formatar: " + meuAniversario);
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(meuAniversario));
        formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(formatter.format(meuAniversario));
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(formatter.format(meuAniversario));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(formatter.format(meuAniversario));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(formatter.format(meuAniversario));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(formatter.format(meuAniversario));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(formatter.format(meuAniversario));

        // obter campos específicos
        System.out.println("\nDados específicos do aniversário do Sodras:");
        System.out.println(meuAniversario.getDayOfMonth());
        System.out.println(meuAniversario.getYear());
        System.out.println(meuAniversario.getMonth());
        System.out.println(meuAniversario.getMonthValue());
    }
}
