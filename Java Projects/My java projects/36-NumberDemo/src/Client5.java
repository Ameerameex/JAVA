import java.lang.Integer;
public class Client5 {

	public static void main(String[] args) {

		int i=Integer.parseInt("12345");
		System.out.println(++i);
		System.out.println(Integer.toOctalString(333));
		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toHexString(45));
		System.out.println(		Integer.toString(12, 2));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		String input="23746.0";
		double d=Double.parseDouble(input);
		System.out.println(d);
		String string="851";
		Long long1=Long.parseLong(string);
		System.out.println(long1);
		
		
	}

}
