
public class Employee {
	
	int id;
	String name;
	double basicSalary;
	
	double getHRAllowance(){
		double allowanceAmt=0;
		//allowance Percentage is 17% of Basic Salary
		//compute Allowance amount here
		return allowanceAmt;
	}
	
	double getPF(){
		double pfAmt=0;
		//PF Percentage is 11% of Basic Salary
		//compute PF amount here
		return pfAmt;
	}

	double getNetSalary(){
		double netSalary;
		
		//allowance Percentage is 17% of Basic Salary
		//PF Percentage is 11% of Basic Salary
		//net salary is = basicSalary + hramount - pfamount
		
		netSalary=basicSalary;
		
		
		return netSalary;
	}

}
