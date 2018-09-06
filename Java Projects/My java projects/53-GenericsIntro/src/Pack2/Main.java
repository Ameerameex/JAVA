package Pack2;



import Pack1.Circle;
import Pack1.MyTest;
import Pack1.Rectangle;

public class Main {

	public static void main(String[] args) {

		Circle circle= new Circle();
		MyTest myTest=new MyTest();
		myTest.setObject(circle);
		Circle circle2=(Circle) myTest.getObject();
		
		Rectangle rectangle=new Rectangle();
		myTest.setObject(rectangle);
		Rectangle rectangle2=(Rectangle) myTest.getObject();
	}

}
