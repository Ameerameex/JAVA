
  public class Employee {
    int i=100;
    
    static int  j=5000;
	private double basic;
	
	static void test(){
		System.out.println("Suriya");
	}

	Employee(double basic) {
		super();
		this.basic = basic;
	}
	final void setBasic(double basic) {
		this.basic = basic;
	}
	final double getBasic() {
		return basic;
	}

	 
	public double getNetSalary(){
		
		double hra=basic*30.0/100.0;
		double pf=basic*10.0/100.0;
		double net=basic+hra-pf;
		return  net;
	}
public double getNetSalary(int extrahours){
		
		double hra=basic*30.0/100.0;
		double pf=basic*10.0/100.0;
		double net=basic+hra-pf+(extrahours*600.0);
		return  net;
	}
	

}



