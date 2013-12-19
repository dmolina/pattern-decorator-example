package nodecorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumericWriterTest {
	String msg;
	
	@Before
	public void setUp() {
		msg = "Hello";
	}

	@Test
	public void test() {
		EnhancedWriter writer = new NumericWriter();
		
		assertTrue(writer.write_line(msg).indexOf("1:")>=0);
		assertTrue(writer.write_line(msg).indexOf("2:")>=0);
	}

}
