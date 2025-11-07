package je13_manipulando_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TransformacaoDeDatas {
    public static void main(String[] args) {
        // LocalDateTime -> LocalDate
        LocalDateTime aniversarioPedro = LocalDateTime.of(2003,2,18,12,30);
        LocalDate localDate = aniversarioPedro.toLocalDate();
        System.out.println(localDate);

        // LocalDateTime -> LocalTime
        LocalTime localTime = aniversarioPedro.toLocalTime();
        System.out.println(localTime);

        // LocalDate -> LocalDateTime: Tem de adicionar uma hora.
        LocalDateTime data1 = localDate.atTime(20, 20, 20);
        System.out.println(data1);

        // LocalTime -> LocalDateTime: Tem de adicionar a data
        LocalDateTime data2 = localTime.atDate(LocalDate.of(2003, 2, 18)); // coloquei o dia de hoje
        System.out.println(data2);
        data2 = localTime.atDate(LocalDate.now());
        System.out.println(data2);
    }
}
