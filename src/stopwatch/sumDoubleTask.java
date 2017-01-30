package stopwatch;

/**
 * Task for sum numbers to Double. Overwrite method run from Runnable do the
 * task.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.01.17
 *
 */
public class sumDoubleTask implements Runnable {
	private int counter;
	/** Final value for the array's size. */
	static final int ARRAY_SIZE = 500000;

	/**
	 * Initialize a new sumDoubleTask.
	 * 
	 * @param count
	 *            is the number of numbers to add into Double.
	 */
	public sumDoubleTask(int count) {
		this.counter = count;
	}

	/**
	 * overwrite method run to sum the numbers in Double.
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * overwrite method toString to return what this task do.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d",
				counter);
	}

}
