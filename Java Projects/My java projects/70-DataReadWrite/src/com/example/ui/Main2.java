package com.example.ui;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws Exception {
		
InputStream inputStream=new FileInputStream("MyData.dat");
DataInputStream dataInputStream=new DataInputStream(inputStream);
System.out.println(dataInputStream.readByte());
System.out.println(dataInputStream.readShort());
System.out.println(dataInputStream.readInt());
System.out.println(dataInputStream.readLong());
System.out.println(dataInputStream.readFloat());
System.out.println(dataInputStream.readDouble());
System.out.println(dataInputStream.readUTF());
System.out.println(dataInputStream.readBoolean());
System.out.println(dataInputStream.readChar());
		
		
	}

}
