
public class Main4 {

	public static void main(String[] args) {
		
		int number=5435;
		int count=0;
		
		while(number!=0){
			
			number=number/10;
			count++;
		}
		System.out.println("count of individual digits ="+count);

	}

}
