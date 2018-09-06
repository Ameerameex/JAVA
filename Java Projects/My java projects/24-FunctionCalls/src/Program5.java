
public class Program5 {

	public static void main(String[] args) {
		
		new Processing();
		Processing processing2=new Processing(10,30);
		System.out.println(processing2.getX());
		System.out.println(processing2.getY());
		
		Processing.printZ();
		processing2.test(10);

	}

}
