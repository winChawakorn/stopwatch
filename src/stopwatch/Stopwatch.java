package stopwatch;

public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;

	public Stopwatch() {

	}

	public double getElapsed() {
		if (isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

	public boolean isRunning() {
		if (stopTime >= startTime) {
			return false;
		} else {
			return true;
		}
	}

	/** Start the stopwatch if it is not already running. */
	public void start() {
		if (isRunning()) {
			return;
		}
		startTime = System.nanoTime();
	}

	public void stop() {
		if (isRunning())
			stopTime = System.nanoTime();
	}
}
