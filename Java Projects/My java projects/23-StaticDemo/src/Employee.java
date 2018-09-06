
public class Employee {
	
	int id;
	String name;
	double basicSalary;
	
	 static double hraPercentage;
	 static double pfPercentage;
	
	double getHRAllowance(){
		double allowanceAmt=0;
		allowanceAmt=hraPercentage*basicSalary;
		return allowanceAmt;
	}
	
	double getPF(){
		double pfAmt=0;
		pfAmt=pfPercentage*basicSalary;
		return pfAmt;
	}

	double getNetSalary(){
		double netSalary;
		netSalary=basicSalary+getHRAllowance()-getPF();
		return netSalary;
	}

}
