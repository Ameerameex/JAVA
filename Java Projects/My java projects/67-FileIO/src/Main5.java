import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main5 {

	public static void main(String[] args) throws Exception {
		
		byte[] arr={65,66,67,68,69,70};
		OutputStream outputStream=new FileOutputStream("ABC.txt");
		outputStream.write(arr);
		outputStream.flush();
		outputStream.close();
	}
}
