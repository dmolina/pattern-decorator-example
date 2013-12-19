package nodecorator;

/**
 * This class print a msg numbering the lines
 * @author dmolina
 *
 */
public class NumericWriter extends EnhancedWriter {
	int line_number;
	
	public NumericWriter() {
		line_number = 1;
	}

	@Override
	public String write_line(String msg) {
		String output = String.format("%d: %s", line_number, msg);
		line_number += 1;
		return output;
	}

}
