package NewCharacter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataApi {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatLocalDateTime = formatter.format(localDateTime);
        System.out.println(formatLocalDateTime);
    }
}
