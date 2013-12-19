package decorator;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import utils.DateUtils;

public class TimestampWriter extends EnhancedWriter {
	public TimestampWriter(Writer writer) {
		super(writer);
	}

	@Override
	public String transform(String msg) {
		return String.format("[%s] - %s", DateUtils.today(), msg);
	}
}
