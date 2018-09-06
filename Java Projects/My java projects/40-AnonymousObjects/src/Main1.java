
public class Main1 {

	public static void main(String[] args) {

		System.out.println(new int[3].length);
		System.out.println((new int[5])[4]);
		System.out.println((new int[]{50,60,70}[1]));
		
		int a=10;
		
		System.out.println((new int[]{++a,(a+1),(a+10)})[2]);
		
		
		System.out.println(new Square(5).getArea());
		System.out.println(new Circle(5).getDiameter());
		System.out.println(new Circle(5).getArea());

		Circle c= new Circle(5);
		System.out.println(c.getArea());
		System.out.println(c.getDiameter());
	}

}
