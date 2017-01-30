package stopwatch;

/**
 * Task for append chars to StringBuilder. Overwrite method run from Runnable do
 * the task.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.01.17
 *
 */
public class AppendToStringBuilderTask implements Runnable {
	private int count;

	/**
	 * Initialize a new AppendToStringBuilderTask.
	 * 
	 * @param count
	 *            is the number of chars to add into StringBuilder.
	 */
	public AppendToStringBuilderTask(int count) {
		this.count = count;
	}

	/**
	 * overwrite method run to append chars to StringBuilder.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		String result = builder.toString();
		System.out.println("final string length = " + result.length());
	}

	/**
	 * overwrite method toString to return what this task do.
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder", count);
	}

}
