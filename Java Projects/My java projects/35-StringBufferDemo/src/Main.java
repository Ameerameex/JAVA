
public class Main {

	public static void main(String[] args) {
		
		StringBuffer buffer=new  StringBuffer();
		
		buffer.append("suriya");
		buffer.append(100);
		buffer.append(450.00);
		buffer.append(new char[]{'x','y'});
		
		System.out.println(buffer);
		
		buffer.insert(2, 5.00);
		System.out.println(buffer);
		
		buffer.delete(3, 7);
		
		System.out.println(buffer);
		
		String text=buffer.toString();
		
		System.out.println(text);
			
		}
	}
	

