package je13_manipulando_datas;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraSemData {
    public static void main(String[] args) {
        // agora
        LocalTime agora = LocalTime.now();
        System.out.println("Agora: " + agora);

        // instanciação especifica hora - minuto - segundo - nanosegundo
        LocalTime inventei = LocalTime.of(10, 59, 30);
        System.out.println(inventei);

        // Só hora e minuto
        inventei = LocalTime.of(10, 20);
        System.out.println(inventei);

        // Pegar de String
        inventei = LocalTime.parse("12:30");
        System.out.println(inventei);

        // Formatador
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        System.out.println(LocalTime.parse("133020", formatter));

        // Manipulação - partindo de 12:30
        System.out.println(inventei.plusHours(1)); // mais 1 hora
        System.out.println(inventei.plusMinutes(10)); // mais 10 minutos
        System.out.println(inventei.plusSeconds(10)); // mais 10 segundos

        // Comparação
        System.out.println(inventei.isAfter(agora));
        System.out.println(inventei.isBefore(agora));
        System.out.println(inventei.equals(agora));

        // Formatação
        formatter = DateTimeFormatter.ofPattern("ss-mm-hh");
        System.out.println(inventei.format(formatter));

        // Pegar campos específicos
        System.out.println("Hora: " + agora.getHour());
        System.out.println("Minuto: " + agora.getMinute());
        System.out.println("Segundo: " + agora.getSecond());
        System.out.println("Nano segundos: " + agora.getNano());
    }
}
