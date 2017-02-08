package stopwatch;

/**
 * Task for sum numbers to double. Overwrite method run from Runnable do the
 * task.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.02.08
 *
 */
public class SumDoublePrimitiveTask implements Runnable {
	private int counter;
	/** Final value for the array's size. */
	static final int ARRAY_SIZE = 500000;
	// create array of values to add before we start the timer
	static double[] values = new double[ARRAY_SIZE];
	static double sum = 0.0;

	/**
	 * Initialize a new sumDoublePrimitiveTask.
	 * 
	 * @param count
	 *            is the number of numbers to add into double.
	 */
	public SumDoublePrimitiveTask(int count) {
		this.counter = count;
	}

	/**
	 * overwrite method run to sum the numbers in double.
	 */
	@Override
	public void run() {
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
	}

	/**
	 * overwrite method toString to return what this task do.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d",
				counter) + "\nsum = " + sum;
	}

}