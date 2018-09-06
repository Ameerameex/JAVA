
public class Main {

	static void print(int... x){
		
		for (int i = 0; i < x.length; i++) {
			
			System.out.print(x[i]+"\t");
		}
		
		System.out.println();
	}
	static int findSum(int y,int...x ){
		int sum=0;
		
		for (int i = 0; i < x.length; i++) {
			
			sum+=x[i];
			
		}
		return sum;
	}
	static void demo(String x,double... d){
		
	}
	//multiple ellipsis is not allowed
	//static void test(int... x,float... y){
		
	//}
	static void printobject(Object arr){
		
		
	}
	//static void print(int[] arr){
		
	//}
	
	public static void main(String... args) {

		
		print(1,2,3);
		print(10,20,30,40,50,60,70);
		print();
		print(-1,-2);
		int[] marks={50,90,95};
		print(marks);
		
		System.out.println(findSum(2,3,4,5));
	}

}
