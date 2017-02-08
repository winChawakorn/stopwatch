package stopwatch;

/**
 * Task for append chars to string. Overwrite method run from Runnable do the
 * task.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.02.08
 *
 */
public class AppendToStringTask implements Runnable {
	private int count;
	String result = "";

	/**
	 * Initialize a new AppendToStringTask.
	 * 
	 * @param count
	 *            is the number of chars to add into string.
	 */
	public AppendToStringTask(int count) {
		this.count = count;
	}

	/**
	 * overwrite method run to append chars to string.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
	}

	/**
	 * overwrite method toString to return what this task do.
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", count)
				+ ("final string length = " + result.length());
	}
}
