package decorator;

/**
 * Interface that print a msg
 * @author dmolina
 *
 */
public interface Writer {
	/**
	 * Output the msg (in the same way or with additional information) 
	 * @param msg to show
	 * @return the output
	 */
	public String write_line(String msg);
}
