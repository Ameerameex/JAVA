import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

String string=new String("I live in chennai. I work in a company called ameex technology");
StringTokenizer stringTokenizer=new StringTokenizer(string,".");
System.out.println(stringTokenizer.countTokens());

while(stringTokenizer.hasMoreTokens()){
	
	//System.out.println(stringTokenizer.nextToken());
	String s= stringTokenizer.nextToken();
	System.out.println(s.length()+" "+s.toUpperCase());
}


		
		
	}

}
