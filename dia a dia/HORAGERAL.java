import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class HORAGERAL{

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");	
		
		Date d = Date.from(Instant.parse("2022-05-27T14:53:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutos = " + minutes);
		System.out.println("Mês = "+ month);

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-05-22");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-22T01:30:26");
        Instant d06 = Instant.parse("2023-05-22T01:30:26Z");
        Instant d07 = Instant.parse("2023-05-22T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("22/05/2023",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("22/05/2023 01:30",fmt2);
        
        LocalDate d10 = LocalDate.of(2023, 5, 25);
        LocalDateTime d11 = LocalDateTime.of(2023,5,25,11,45);
        
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        
        LocalDate pastweek = d04.minusDays(7);
        LocalDate nextweek = d04.plusDays(7);
        
        LocalDateTime pastweektime = d05.minusDays(7);
        LocalDateTime nextweektime = d05.plusDays(7);
        
        Instant pastweekinstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextweekinstant = d06.plus(7, ChronoUnit.DAYS);
        
        Duration t1 = Duration.between(pastweektime, d05);
        Duration t2 = Duration.between(pastweek.atStartOfDay(), d04.atTime(0,0));

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08.format(fmt1));
        System.out.println(d09.format(fmt2));
        System.out.println(d10);
        System.out.println(d11);
        System.out.println(fmt2.format(d06));
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(d04.getDayOfMonth());
        System.out.println(d04.getYear());
        System.out.println(d04.getMonthValue());
        System.out.println(pastweek);
        System.out.println(nextweek);
        System.out.println(pastweektime);
        System.out.println(nextweektime);
        System.out.println(pastweekinstant);
        System.out.println(nextweekinstant);
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());


	}

}
