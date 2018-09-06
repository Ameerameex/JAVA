import java.util.Scanner;

public class MarksProcessingClient {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);	
MarksProcessing m=new MarksProcessing();
System.out.println("Enter the valid input");

/*int value1=scanner.nextInt();
int value2=scanner.nextInt();
int value3=scanner.nextInt();
int value4=scanner.nextInt();
int value5=scanner.nextInt();


int[] is={value1,value2,value3,value4,value5};*/
int countOfInputs;
System.out.print("How many values you want to Input ? ");
countOfInputs = scanner.nextInt();
if (countOfInputs <= 0) {
	System.out.println("Invalid Input value - Input value should be a positive number");
	System.out.println("Please Try Again...!!!");
} else {

	int[] values = new int[countOfInputs];

	for (int i = 0; i < values.length; i++) {
		
		
			
			values[i]=scanner.nextInt();
			m.addMark(values[i]);
			
	}


m.printDetail();

	}

}
}