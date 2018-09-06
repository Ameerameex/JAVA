
public enum Gender {

	
	MALE('M',70,160),FEMALE('F',52,150);
	
	
	char value;
	double averageWeight;
	int averageHeight;
	private Gender(char value, double averageWeight, int averageHeight) {
		this.value = value;
		this.averageWeight = averageWeight;
		this.averageHeight = averageHeight;
	}
	public final char getValue() {
		return value;
	}
	
	public final double getAverageWeight() {
		return averageWeight;
	}
	
	public final int getAverageHeight() {
		return averageHeight;
	}
	
	public String toString() {
		if(this.value=='M')
		return "Male";
		else
			return "Female";
	}
	
}
