package nodecorator;

public class TimestampNumericWriter extends TimestampingWriter {
	int line_number;
	
	public TimestampNumericWriter() {
		line_number = 1;
	}
	
	@Override
	public String write_line(String msg) {
		return super.write_line(String.format("%d: %s", line_number, msg));
}
}
