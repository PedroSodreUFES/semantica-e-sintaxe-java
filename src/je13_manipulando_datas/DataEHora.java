package je13_manipulando_datas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataEHora {
    public static void main(String[] args) {
        // Data e Hora - forma mais usada.

        // agora
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        // hora instanciada
        LocalDateTime data = LocalDateTime.of(2025, 11, 7, 12, 30, 50, 100);
        System.out.println(data);
        data = LocalDateTime.of(2025, 11, 10, 10, 12); // condição mínima
        System.out.println(data);

        // Manipulação
        System.out.println(agora.plusDays(1)); // amanhã
        System.out.println(agora.minusDays(1)); // ontem
        System.out.println(agora.plusYears(1)); // ano que vem
        System.out.println(agora.plusYears(-1)); // ano passado
        System.out.println(agora.plusHours(1)); // uma hora que vem
        System.out.println(agora.plusMonths(1)); // mês que vem

        // comparação
        System.out.println("\nComparação de datas:");
        LocalDateTime ontem = agora.minusDays(1);
        System.out.println(ontem.isAfter(agora));
        System.out.println(ontem.isBefore(agora));
        System.out.println(ontem.isEqual(agora));

        // Formatação
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(agora.format(formatter));
    }
}
