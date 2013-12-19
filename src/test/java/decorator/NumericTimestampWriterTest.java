package decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumericTimestampWriterTest {

	@Test
	public void test() {
		String msg = "Hello";
		Writer timestamp_writer = new TimestampWriter(new SimpleWriter());
		Writer writer = new NumericWriter(timestamp_writer);
		System.out.println(writer.write_line(msg));
	}

}
