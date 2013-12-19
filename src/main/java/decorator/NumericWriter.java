package decorator;

public class NumericWriter extends EnhancedWriter {
	private int line_number;
	
	public NumericWriter(Writer writer) {
		super(writer);
		line_number = 1;
	}

	@Override
	public String transform(String msg) {
		String output = String.format("%d: %s", line_number, msg);
		line_number += 1;
		return output;
	}

}
