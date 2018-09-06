
public class Main2 {

	
	public static void main(String[] args) {
		
		
		Number n1;
		
		byte b=100;
		n1=new Byte(b);
float v1=n1.floatValue();
		
		System.out.println(v1);
		
		double v2=n1.doubleValue();
		long v3=n1.longValue();
		short v4=n1.shortValue();
		byte v5=n1.byteValue();
		int v6=n1.intValue();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		
		n1=new Integer(125);
		System.out.println(n1.intValue());
		n1=new Long(100);
		n1=new Double(100.0);

	}
}
