import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main1 {

	public static void main(String[] args) throws Exception {

		File file=new File("AboutKanyakumari.txt");
		InputStream in=new FileInputStream(file);	
		int i;
		do{
			i=in.read();
			if(i==-1)
				break;
			char ch=(char) i;
			System.out.print(ch);
		}while(true);
		
		
	}

}
