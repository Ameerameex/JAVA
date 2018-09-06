
public class Client2 {

	public static void main(String[] args) {

		
		String myname=new String("Ameex Technologies,chennai,Tamilnadu");
		
		System.out.println(myname.length());
		
		System.out.println(myname.charAt(6));
		System.out.println(myname.charAt(myname.length()-1));
		System.out.println(myname.indexOf('T'));
		
		System.out.println(myname.substring(0));
		System.out.println(myname.indexOf('T', 10));
		System.out.println(myname.lastIndexOf('i'));
		System.out.println(myname.lastIndexOf('i', 20));
		
		//find how many vowels are in the string
	
		
		String string=myname.toUpperCase();
		
		System.out.println(string);
		
		
		System.out.println(myname.toLowerCase());
		String s5= myname.replace(',', '-');
		System.out.println(s5);
		
		String string2=myname.substring(5);
		
		System.out.println(string2);
				String string3=myname.substring(5,19);
				
				System.out.println(string3);
	}

}