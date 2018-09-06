import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main4 {

	public static void main(String[] args) throws Exception {

		byte[] arr={97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116
				,117,118,119,120,121,122};
		InputStream inputStream=new ByteArrayInputStream(arr);
		
		OutputStream outputStream;
		outputStream=new FileOutputStream("info.txt");
		
		int i;
		do{
			i=inputStream.read();
			if(i==-1){
				break;
			}
			outputStream.write(i);
		}while(true);
		outputStream.flush();
		outputStream.close();
		
		
	}

}
