import java.util.*;
public class Main1 {

	public static void main(String[] args) {
       String myName="Ameer";
       int myAge=20;
       double mySalary=12000.00;
       
      String output= String.format("%s%10d%10.2f",myName,myAge,mySalary);
      
       System.out.println(output);
       
	}

}
