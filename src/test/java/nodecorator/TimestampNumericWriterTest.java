package nodecorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimestampNumericWriterTest {

	@Test
	public void test() {
		String msg = "hola";
		EnhancedWriter writer = new TimestampNumericWriter();
		String output = writer.write_line(msg);
		assertTrue(output.length() > msg.length());
		assertTrue(output.indexOf(msg)>0);
		System.out.println(output);
	}

}
