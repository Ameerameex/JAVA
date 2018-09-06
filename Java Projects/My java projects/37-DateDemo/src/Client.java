import java.util.Date;

public class Client {

	public static void main(String[] args) {

		Date d;
		d=new Date();
		System.out.println(d);
	int i=d.getMonth();
	int j=d.getYear();
	int k=d.getDate();
	
	System.out.println(i);
	System.out.println(j);
	
	long l=d.getTime();
	
	System.out.println(l);
	
	int m=24*60*60*1000;
	l=l+m;
	
	Date date=new Date(l);
	
	System.out.println(date);
	
	Date date2=new Date(0);
	
	System.out.println(date2);

	Date date3=new Date(24*60*60*1000);
	System.out.println(date3);
	
	}

}
