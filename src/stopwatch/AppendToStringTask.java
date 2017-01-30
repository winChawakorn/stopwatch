package stopwatch;

public class AppendToStringTask implements Runnable {
	private int count;

	public AppendToStringTask(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}

	@Override
	public String toString() {
		return String.format("Append %,d chars to String", count);
	}
}
