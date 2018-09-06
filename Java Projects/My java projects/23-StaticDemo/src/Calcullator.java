
public class Calcullator {

	
	 private int number1,number2,result;
	 int getNumber1() {
		return number1;
	}
	 void setNumber1(int number1) {
		this.number1 = number1;
	}
	 int getNumber2() {
		return number2;
	}
	 void setNumber2(int number2) {
		this.number2 = number2;
	}
	 int getResult() {
		return result;
	}
	 void setResult(int result) {
		this.result = result;
	}
	 private static String myName;
	  static String getMyName() {
		return myName;
	}
	 static void setMyName(String myName) {
		Calcullator.myName = myName;
	}
	 static double getPi() {
		return pi;
	}
	 static void setPi(double pi) {
		Calcullator.pi = pi;
	}
	private static double pi=3.14;
	void add(){
		result=number1+number2;
		
	}
	void subtract(){
		
		result=number1-number2;
	}
}
