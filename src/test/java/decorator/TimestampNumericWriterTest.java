package decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimestampNumericWriterTest {

	@Test
	public void test() {
		String msg = "hola";
		Writer numericWriter = new NumericWriter(new SimpleWriter());
		Writer writer = new TimestampWriter(numericWriter);
		String output = writer.write_line(msg);
		assertTrue(output.length() > msg.length());
		assertTrue(output.indexOf(msg)>0);
		System.out.println(output);
	}

}
