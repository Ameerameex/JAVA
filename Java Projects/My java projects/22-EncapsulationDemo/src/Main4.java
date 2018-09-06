public class Main4{

	public static void main(String[] args) {
		
		Student s=new Student(1002, "Suriya",100, 90, 80);
		
		
	
		
		System.out.println(" Roll Num : " + s.getRollno());
		System.out.println(" Name :"+s.getName());
		System.out.println(s.getMark1());
		System.out.println(s.getMark2());
		System.out.println(s.getMark3());
		System.out.println("Total : " + s.getTotal());
		System.out.println(" Average : "+ s.getAverage());
		
		

	}

}
