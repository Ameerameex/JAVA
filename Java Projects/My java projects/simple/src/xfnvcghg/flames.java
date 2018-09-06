package xfnvcghg;

import java.util.Scanner;

public class flames {

	public static void main(String[] args) {

		int count=0;
		Scanner ref = new Scanner(System.in);
		
		System.out.println("enter the name1");
		
		String name1=ref.nextLine();
		
		System.out.println("enter the name2");
		
        String name2=ref.nextLine();
        
        String flame="flames";
        
        int lenhth=flame.length();
        
        String name3="";
        
        String name4="";
        
	for (int i = 0; i < name1.length(); i++) {
			
			char ch=name1.charAt(i);
			if(ch!=' '){
				
				name3 +=ch;
				
				
			}
	}
			for (int j= 0; j< name2.length(); j++) {
				
				char ch1=name2.charAt(j);
				if(ch1!=' '){
					
					name4 +=ch1;
				}
				}	
			System.out.println(name3);
			System.out.println(name4);
			
			String name5=name3+name4;
			int length1=name5.length();
			char[] ch2=name3.toCharArray();
			char[] ch3=name4.toCharArray();
			
			for(int k=0;k<ch2.length;k++){
				
				for(int l=0;l<ch3.length;l++){
					
					
					if(ch2[k]==ch3[l]){
						
						count++;
						ch3[l]='#';
						break;
						
					}
				}
				
			}
			int total=length1-(2*count);
			int num=0;
			
			System.out.println(total);
			
			for(int s=1;s<=5;s++){
				
			if(total>lenhth){
				num=total-lenhth;
			}
			else{
				num=total;
			}
			while(num>lenhth){
				
				num=num-lenhth;
				
				
			}
			flame=flame.substring(num)+flame.substring(0,num-1);
			lenhth--;
	}
			switch (flame) {
			case "f" :System.out.println("friendship");
				break;
			case "l" :System.out.println("love");
			break;
			case "a" :System.out.println("affection");
			break;
			case "m" :System.out.println("marriage");
			break;
			case "e" :System.out.println("enemy");
			break;
			case "s" :System.out.println("sister or brother");
			break;


			
				
			}
	}

}
