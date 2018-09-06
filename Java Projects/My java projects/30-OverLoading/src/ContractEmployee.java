
public class ContractEmployee extends Employee {
	
	
	int contractPeriod;
	

	ContractEmployee(double basic, int contractPeriod) {
		super(basic);
		this.contractPeriod = contractPeriod;
	}
	
		
		public double  getNetSalary(){
			
			double hra=getBasic()*15.0/100.0;
			double pf=getBasic()*5.0/100.0;
			double net=getBasic()+hra-pf;
			return  net;
		}
		public double getNetSalary(int extraHours){
			
			double hra=getBasic()*30.0/100.0;
			double pf=getBasic()*10.0/100.0;
			double net=getBasic()+hra-pf+(extraHours*100.0);
			return  net;
		}
	}


