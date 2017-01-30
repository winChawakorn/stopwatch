package stopwatch;

/**
 * A stopwatch that can count time. Can get the elapse time when the stopwatch
 * is running.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.01.30
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;

	/**
	 * Initialize a new stopwatch.
	 */
	public Stopwatch() {

	}

	/**
	 * Return the elapse time if stopwatch is running. Return the time from the
	 * start time to the stop time if stopwatch is stopped.
	 * 
	 * @return the elapse time.
	 */
	public double getElapsed() {
		if (isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

	/**
	 * Return the stopwatch's status running or not. true if running. false if
	 * not running.
	 * 
	 * @return the stopwatch's status.
	 */
	public boolean isRunning() {
		if (stopTime >= startTime) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Start the stopwatch if it is not already running.
	 */
	public void start() {
		if (isRunning()) {
			return;
		}
		startTime = System.nanoTime();
	}

	/**
	 * Stop the stopwatch if it is running.
	 */
	public void stop() {
		if (isRunning())
			stopTime = System.nanoTime();
	}
}
