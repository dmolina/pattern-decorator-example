package decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeWriterTest {
	private String msg;
	
	@Before
	public void setUp() {
		msg = "Hello";
	}

	@Test
	public void test() {
		Writer writer = new TimestampWriter(new SimpleWriter());
		assertTrue(writer.write_line(msg).length() > msg.length());
		assertTrue(writer.write_line(msg).indexOf(msg)>0);
		System.out.println(writer.write_line(msg));
	}

}
