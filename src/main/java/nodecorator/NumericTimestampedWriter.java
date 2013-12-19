package nodecorator;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class NumericTimestampedWriter extends NumericWriter {
@Override
public String write_line(String msg) {
	LocalDateTime date = new LocalDateTime();
	DateTimeFormatter format = DateTimeFormat.forPattern("dd/MM/YYYY HH:mm:ss");
	return super.write_line(String.format("[%s] %s", format.print(date), msg));
}
}
