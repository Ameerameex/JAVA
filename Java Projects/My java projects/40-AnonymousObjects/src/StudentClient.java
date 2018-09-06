
public class StudentClient {

	public static void main(String[] args) {
		

		System.out.println(new Student(101,"Suriya",80,70, 50).getTotal());
		System.out.println(new Student(101,"Suriya",80,70, 50).getAverage());

		Student s= new Student(101,"Suriya",80,70, 50);
	System.out.println(s.getAverage());
	System.out.println(s.getTotal());
	}

}
