
public class BGradeSalaryCalculator implements SalaryCalculator {
	@Override
	public double getAllowance(double basic) {
		double result;
		Calculator calculator = new Calculator();

		result = calculator.multiply(basic, 0.20);
		return result;
	}

	@Override
	public double getDeduction(double basic) {
		double result;
		Calculator calculator = new Calculator();

		result = calculator.multiply(basic, 0.09);
		return result;
	}

	@Override
	public double getNetSalary(double basic) {
		double a = getAllowance(basic);
		double b = getDeduction(basic);
		Calculator calculator = new Calculator();

		double result = calculator.add(basic, a);
		result = calculator.subtract(result, b);

		return result;
	}

}
