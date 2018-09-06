
public class Program2 {

	static void demo3(int a) {
		System.out.println("demo3: " + (a - a));

	}

	static void demo2(int a) {
		System.out.println("demo2 : " + (a + a));
		demo3(a);
	}

	static void demo1(int a) {
		System.out.println("demo1 : " + (a * a));
		demo2(a);
	}

	static void test(byte p) {
		System.out.println("test : " + p);
         test(p);
	}

	public static void main(String[] args) {

		byte a = 25;
		//demo1(5);
		test(a);

	}

}
