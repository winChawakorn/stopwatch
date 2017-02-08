package stopwatch;

/**
 * Task for sum numbers to Double. Overwrite method run from Runnable do the
 * task.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.02.08
 *
 */
public class SumDoubleTask implements Runnable {
	private int counter;
	/** Final value for the array's size. */
	static final int ARRAY_SIZE = 500000;
	// create array of values to add, before we start the timer
	static Double[] values = new Double[ARRAY_SIZE];
	static Double sum = new Double(0.0);

	/**
	 * Initialize a new sumDoubleTask.
	 * 
	 * @param count
	 *            is the number of numbers to add into Double.
	 */
	public SumDoubleTask(int count) {
		this.counter = count;
	}

	/**
	 * overwrite method run to sum the numbers in Double.
	 */
	@Override
	public void run() {
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
	}

	/**
	 * overwrite method toString to return what this task do.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d",
				counter) + "\nsum = " + sum;
	}

}
