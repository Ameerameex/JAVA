
public class Main {

	public static void main(String[] args) {
		
		Student s;
		s=new Student();
		System.out.println(s.name);
		System.out.println(s.rollno);
		s.rollno=1050;
		s.name="john";
		System.out.println(s.name);
		System.out.println(s.rollno);
		s.mark1=80;
		s.mark2=70;
		s.mark3=90;
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
		

	}

}
