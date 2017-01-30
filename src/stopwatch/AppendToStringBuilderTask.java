package stopwatch;

public class AppendToStringBuilderTask implements Runnable {
	private int count;

	public AppendToStringBuilderTask(int count) {
		this.count = count;
	}

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

	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder", count);
	}

}
