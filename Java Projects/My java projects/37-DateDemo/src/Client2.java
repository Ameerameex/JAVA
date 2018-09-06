import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Client2 {

	public static void main(String[] args)  {

		Date today = new Date();
		
		System.out.println(today);
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		String dat="31/12/1995";
		String date=dateFormat.format(today);
		SimpleDateFormat dateFormat2=new SimpleDateFormat("dd/MM/yyyy");
		  Date date2=null;
		try {
			date2 = dateFormat2 .parse(dat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date2);
		System.out.println(date);
		SimpleDateFormat dateFormat1=new SimpleDateFormat("hh:mm:ss ");
		
		String string2=dateFormat1.format(today);
		System.out.println(string2);

		
	}

}
