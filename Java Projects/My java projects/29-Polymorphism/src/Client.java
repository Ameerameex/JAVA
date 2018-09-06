
public class Client {

	public static void main(String[] args) {

		
		A obj=new A();
		B b=new B();
		obj.f1(10);
		obj.f1(4.14);
		obj.f1(new int[]{1,2,3});
		
		
		b.f1(89);
		
	}

}
