
public class Student {
	
	int rollNumber;
	String name;
	int mark1,mark2,mark3;
	
	public Student(int rollNumber, String name, int mark1, int mark2, int mark3) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	
	public double getTotal(){
		return mark1+mark2+mark3;
	}
	
	public double getAverage(){
		return (mark1+mark2+mark3)/3;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", mark1=" + mark1 + ", mark2=" + mark2
				+ ", mark3=" + mark3 + ", getRollNumber()=" + getRollNumber() + ", getName()=" + getName()
				+ ", getMark1()=" + getMark1() + ", getMark2()=" + getMark2() + ", getMark3()=" + getMark3()
				+ ", getTotal()=" + getTotal() + ", getAverage()=" + getAverage() + "]";
	}
	
}
