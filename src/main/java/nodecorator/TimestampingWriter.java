package nodecorator;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import utils.DateUtils;

public class TimestampingWriter extends EnhancedWriter {

	@Override
	public String write_line(String msg) {
		return String.format("[%s]: %s", DateUtils.today(), msg);		
	}

}
