package Pack2;

import Pack1.Circle;
import Pack1.MyTest;
import Pack1.Rectangle;
import Pack1.Student;

public class Main2 {

	public static void main(String[] args) {

		MyTest<Circle> m;
		m= new MyTest<Circle>();
		m.setObject(new Circle());
		Circle temp=m.getObject();
		
		
		MyTest<Student> m1;
		m1=new MyTest<Student>();
		m1.setObject(new Student());
		Student temp2=m1.getObject();
		
		MyTest<Rectangle> m2;
		m2=new MyTest<Rectangle>();
		m2.setObject(new Rectangle());
		Rectangle temp3=m2.getObject();
		
		
		
	}

}
