package utils;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtils {
   public static String today() {
		LocalDateTime date = new LocalDateTime();
		DateTimeFormatter format = DateTimeFormat.forPattern("dd/MM/YYYY HH:mm:ss");
		return format.print(date);
   }
}
