import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main2 {

	public static void main(String[] args) throws Exception {

File file=new File("AboutKanyakumari.txt");
InputStream inputStream=new FileInputStream(file);
		byte[] arr = new byte[(int) file.length()];
inputStream.read(arr);
for (byte b : arr) {
	
	char ch=(char) b;
	System.out.print(ch);
	
}


	}

}
