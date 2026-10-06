package madhu;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Riya {
public static void main(String args[]) {
	LocalDate dt = LocalDate.now();
	System.out.println(dt);
	LocalTime tt = LocalTime.now();
	System.out.println(tt);

	LocalDateTime ddtt = LocalDateTime.now();
	System.out.println(ddtt);
	System.out.println(ddtt.getDayOfMonth());
	System.out.println(ddtt.getDayOfYear());
	System.out.println(ddtt.getHour());
	System.out.println(ddtt.getMinute());
	System.out.println(ddtt.getSecond());
	System.out.println(ddtt.getYear());
}
}
