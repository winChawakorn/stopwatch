package stopwatch;

import java.math.BigDecimal;

public class sumBigDecimalTask implements Runnable {
	private int counter;
	static final int ARRAY_SIZE = 500000;

	public sumBigDecimalTask(int count) {
		this.counter = count;
	}

	@Override
	public void run() {
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
		System.out.println("sum = " + sum);
	}

	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d", counter);
	}
}
