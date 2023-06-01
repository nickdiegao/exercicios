import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Instant;

public class uivo {
    
    public static void main(String[]args){

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-05-22");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-22T01:30:26");
        Instant d06 = Instant.parse("2023-05-22T01:30:26Z");
        Instant d07 = Instant.parse("2023-05-22T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("22/05/2023",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("22/05/2023 01:30",fmt2);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
    }
}
