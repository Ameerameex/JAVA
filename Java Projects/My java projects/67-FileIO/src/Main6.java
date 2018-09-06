import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) throws Exception {
		String sourcedir, sourcefile;
		String destdir, destfile;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Source Directory Name");
		sourcedir = scanner.next();
		System.out.println("Enter source File Name");
		sourcefile=scanner.next();
		System.out.print("Enter Destination Directory Name");
		destdir=scanner.next();
		System.out.print("Enter Destination File Name");
		destfile=scanner.next();
File file=new File(sourcedir,sourcefile);
File file2=new File(destdir,destfile);


		InputStream inputStream = new FileInputStream(file);
		OutputStream outputStream = new FileOutputStream(file2);

		do {
			int i = inputStream.read();
			if (i == -1) {
				break;
			}
			outputStream.write(i);
		} while (true);
		outputStream.flush();

		inputStream.close();
		outputStream.close();

	}

}
