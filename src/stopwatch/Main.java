package stopwatch;

/**
 * Main for the task time counting.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.01.17
 *
 */
public class Main {
	/**
	 * Run the program.
	 */
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();
		timer.measureAndPrint(new AppendToStringTask(50000));
		timer.measureAndPrint(new AppendToStringTask(100000));
		timer.measureAndPrint(new AppendToStringBuilderTask(100000));
		timer.measureAndPrint(new SumDoublePrimitiveTask(1000000000));
		timer.measureAndPrint(new SumDoubleTask(1000000000));
		timer.measureAndPrint(new SumBigDecimalTask(1000000000));
	}
}
