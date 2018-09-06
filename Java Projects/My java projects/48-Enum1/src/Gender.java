
public class Gender {

	char value;
	
	public static final Gender MALE=new Gender('M');
	public static final Gender FEMALE=new Gender('F');

	private Gender(char value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		if(this.value=='M')
		return "Male";
		else
			return "Female";
	}
	
	
	
	
}
