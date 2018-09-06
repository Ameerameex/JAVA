
public class Manager extends Employee {
	
	int i=200;
	static int j=6000;
	int teamSize;
	static void test(){
		System.out.println("kumar");
	}
	
	
	 
	Manager(double basic, int teamSize) {
		super(basic);
		this.teamSize = teamSize;
	}
	public double getNetSalary(){
		
		double hra=getBasic()*30.0/100.0;
		double pf=getBasic()*10.0/100.0;
		double net=getBasic()+hra-pf+(teamSize*200);
		return  net;
	}
public double getNetSalary(int extrahours){
		
		double hra=getBasic()*30.0/100.0;
		double pf=getBasic()*10.0/100.0;
		double net=getBasic()+hra-pf+(extrahours*2000.0);
		return  net;
	}
	
	
	

}
