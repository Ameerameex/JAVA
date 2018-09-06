
public class Student {

	
	
private	int rollno;
	private String name;
  private	int mark1,mark2,mark3;
	
  
  
	 public Student() {
	
		 super();
	
	
}
	public Student(int rollno, String name, int mark1, int mark2, int mark3) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.mark1 = mark1;
	this.mark2 = mark2;
	this.mark3 = mark3;
}
	int getRollno() {
	return rollno;
}
 void setRollno(int rollno) {
	this.rollno = rollno;
}
 String getName() {
	return name;
}
 void setName(String name) {
	this.name = name;
}
 int getMark1() {
	return mark1;
}
 void setMark1(int mark1) {
	this.mark1 = mark1;
}
 int getMark2() {
	return mark2;
}
 void setMark2(int mark2) {
	this.mark2 = mark2;
}
 int getMark3() {
	return mark3;
}
 void setMark3(int mark3) {
	this.mark3 = mark3;
}
	int getTotal(){
		return mark1+mark2+mark3;
	}
	int getAverage(){
		return getTotal()/3;
	}
}
