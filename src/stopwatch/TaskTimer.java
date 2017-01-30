package stopwatch;

public class TaskTimer {
	private Stopwatch time = new Stopwatch();

	public TaskTimer() {
	}

	public void measureAndPrint(Runnable runner) {
		System.out.println(runner.toString());
		time.start();
		runner.run();
		time.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", time.getElapsed());
	}
}
