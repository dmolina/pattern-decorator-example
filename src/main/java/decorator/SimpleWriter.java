package decorator;

/**
 * Simple writer (without additional funcionality), it is too simple
 * @author dmolina
 *
 */
public class SimpleWriter implements Writer {

	public String write_line(String msg) {
		return msg;
	}

}
