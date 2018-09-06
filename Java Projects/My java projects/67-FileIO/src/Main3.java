import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main3 {

	public static void main(String[] args) throws Exception {

		byte[] arr={65,66,67,68,69,70};
		InputStream inputStream;
		inputStream=new ByteArrayInputStream(arr);
		
		System.out.println((char)inputStream.read());
		System.out.println(inputStream.read());
		System.out.println(inputStream.read());
		System.out.println(inputStream.read());
		System.out.println(inputStream.read());
		System.out.println(inputStream.read());
		
		inputStream.close();


	}

}
