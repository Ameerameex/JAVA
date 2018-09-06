
public class Main6 {

	public static void main(String[] args) {
		
		
		int number=1234;
		int num=0,rev=0;
		
		
		while(number!=0){
			 
			rev=(rev*10)+(number%10);
			number=number/10;
			
			}
		while(rev!=0){
			num=rev%10;
			if(num%2==0){
				System.out.print(num);
			}
			rev=rev/10;
			
		}
		
	
		
	}

}
