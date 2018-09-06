
public class Main {

	public static void main(String[] args) {
		
		int a=50;
		int b=60;
		int c=70;
		
		int[] values;
		values=new int[3];
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values.length);
		values[0]=a;
		values[1]=b;
		values[2]=c;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
	
		System.out.println(values[0]+values[1]+values[2]);
		
		values=null;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values.length);
		


		

	}

}
