package stopwatch;

public class Main {
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();
		timer.measureAndPrint(new AppendToStringTask(50000));
		timer.measureAndPrint(new AppendToStringTask(100000));
		timer.measureAndPrint(new AppendToStringBuilderTask(100000));
		timer.measureAndPrint(new sumDoublePrimitiveTask(1000000000));
		timer.measureAndPrint(new sumDoubleTask(1000000000));
		timer.measureAndPrint(new sumBigDecimalTask(1000000000));
	}
}
