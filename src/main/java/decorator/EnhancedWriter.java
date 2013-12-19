package decorator;

/**
 * Class that implements the decorator pattern
 * 
 * @author dmolina
 *
 */
public abstract class EnhancedWriter implements Writer {
	Writer writer;
	
	/**
	 * The constructor receives a previous funcionality
	 * @param writer the original functionality
	 */
	public EnhancedWriter(Writer writer) {
		this.writer = writer;
	}
	
	/**
	 * Write the output combining a new transformation with the previous
	 * transformation
	 * @param msg to show
	 * @return the final msg  
	 */
	public String write_line(String msg) {
		return transform(writer.write_line(msg));
	}
	
	/**
	 * Transformation with the additional functionality 
	 * @param msg to show
	 * @return the transformed msg 
	 */
	public abstract String transform(String msg);
}
