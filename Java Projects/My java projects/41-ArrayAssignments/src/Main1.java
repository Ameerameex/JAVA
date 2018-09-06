
public class Main1 {

	static double getTotal(Number... allNumbers) {
		double sum = 0.0;
		for (Number number : allNumbers) {

			sum += number.doubleValue();

		}

		return sum;
	}

	static double getMinimum(Number... allNmbers) {
		double min = allNmbers[0].doubleValue();

		for (Number number : allNmbers) {

			if (min > number.doubleValue()) {

				min = number.doubleValue();
			}
		}
		return min;

	}

	static double getMaximum(Number... allNmbers) {
		double max = allNmbers[0].doubleValue();

		for (Number number : allNmbers) {

			if (max < number.doubleValue()) {

				max = number.doubleValue();
			}
		}
		return max;

	}

	static double getAverage(Number... allNumbers) {
		double avg = getTotal(allNumbers) / allNumbers.length;

		return avg;
	}

	public static void main(String[] args) {

		Number[] numbers = { 10, 5, 7, new Integer(6), new Double(12.0), };

		System.out.println(getTotal(numbers));

		System.out.println(getMinimum(numbers));
		System.out.println(getMaximum(numbers));
		System.out.println(getAverage(numbers));

	}

}
