package nodecorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumericTimestampWriterTest {

	@Test
	public void test() {
		String msg = "Hello";
		EnhancedWriter writer = new NumericTimestampedWriter();
		System.out.println(writer.write_line(msg));
	}

}
