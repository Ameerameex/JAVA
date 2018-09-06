
public class Circle {

	private int radius;

	Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public double getDiameter(){
		return radius*2;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	
	
}
