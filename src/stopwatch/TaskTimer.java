package stopwatch;

/**
 * TaskTimer is the timer for counting time from the task.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.01.30
 *
 */
public class TaskTimer {
	/** Initialize the stopwatch to count the time for each task. */
	private Stopwatch time = new Stopwatch();

	/**
	 * Initialize a new TaskTimer.
	 */
	public TaskTimer() {

	}

	/**
	 * Measure the time from the task, print toString from the task, and print
	 * the task's elapse time.
	 * 
	 * @param runner
	 *            is the Runnable from the task.
	 */
	public void measureAndPrint(Runnable runner) {
		System.out.println(runner.toString());
		time.start();
		runner.run();
		time.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", time.getElapsed());
	}
}
