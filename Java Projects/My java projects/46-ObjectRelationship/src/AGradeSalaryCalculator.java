
public class AGradeSalaryCalculator implements SalaryCalculator {

	@Override
	public double getAllowance(double basic) {
		double result;
Calculator calculator=new Calculator();

		result =calculator.multiply(basic, 0.30);
		return result;
	}

	@Override
	public double getDeduction(double basic) {
		double result;
		Calculator calculator=new Calculator();

				result =calculator.multiply(basic, 0.10);
				return result;
	}

	@Override
	public double getNetSalary(double basic) {
		double a=getAllowance(basic);
		double b=getDeduction(basic);
		Calculator calculator=new Calculator();

		 double result =calculator.add(basic, a);
		 result=calculator.subtract(result, b);
		 
		return result;
	}

}
