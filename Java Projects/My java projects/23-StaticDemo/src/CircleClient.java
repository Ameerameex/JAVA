
public class CircleClient {

	public static void main(String[] args) {
		
		
		Circle circle,circle2,circle3;
		circle=new Circle();
		circle2=new Circle();
		circle3=new Circle();
		
		circle.radius=5;
		circle2.radius=10;
		circle3.radius=20;
		System.out.println(circle.pi);
		System.out.println(circle2.pi);
		System.out.println(circle3.pi);
		System.out.println(circle.pi);
		System.out.println(circle2.pi);
		System.out.println(circle3.pi);
		circle.radius=30;
		System.out.println(Circle.pi);
		
		
	}

}
