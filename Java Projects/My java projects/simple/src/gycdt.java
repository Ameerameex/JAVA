import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class gycdt {
	
	public static void main(String[] args) {
		
DateTimeFormatter ref=DateTimeFormatter.ofPattern("YYYY/MM/DD HH:MM:SS ");

LocalDateTime FMT=LocalDateTime.now();
System.out.println(FMT);
System.out.println(ref.format(FMT));
		
		
	}

}
