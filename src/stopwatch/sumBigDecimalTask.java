package stopwatch;

import java.math.BigDecimal;

/**
 * Task for sum numbers to BigDecimal. Overwrite method run from Runnable do the
 * task.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.02.08
 *
 */
public class SumBigDecimalTask implements Runnable {
	private int counter;
	/** Final value for the array's size. */
	static final int ARRAY_SIZE = 500000;
	static BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
	static BigDecimal sum = new BigDecimal(0.0);

	/**
	 * Initialize a new sumBigDecimalTask.
	 * 
	 * @param count
	 *            is the number of numbers to add into BigDecimal.
	 */
	public SumBigDecimalTask(int count) {
		this.counter = count;
	}

	/**
	 * overwrite method run to sum the numbers in BigDecimal.
	 */
	@Override
	public void run() {
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
	}

	/**
	 * overwrite method toString to return what this task do.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d", counter)
				+ "\nsum = " + sum;
	}
}
