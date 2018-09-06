
public class Program4 {
	
	static void test1(int num){
		num++;
		System.out.println(num);
	}
	
	static void test2(int[] is){
		
		is[0]=is[0]*2;
		is[1]=is[1]*2;
		is[2]=is[2]*2;
	}
	
	static void test3(Student s){
		
		s.setName("RAmesh");
		s.setMark1(200);
		
	}

	public static void main(String[] args) {
		
		
	/*	int num=10;
		System.out.println(num);
		test1(num);
		System.out.println(num);
		int [] arr={3,4,5};
		
		for (int v:arr) {
			System.out.print(v+"\t\t");
			
		}
		
		System.out.println();
		test2(arr);
		for (int v:arr) {
			System.out.print(v+"\t\t");
			
		}
		*/
		
		Student s=new Student(101, "abc", 50, 40,60);
		System.out.println(s.getRollNumber()+"    "+s.getName()+"    "+s.mark1+"     "+s.mark2+"    "+s.mark3);
		test3(s);
		System.out.println(s.getRollNumber()+"    "+s.getName()+"    "+s.mark1+"     "+s.mark2+"    "+s.mark3);
	}

}
