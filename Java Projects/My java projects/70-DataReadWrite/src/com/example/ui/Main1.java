
package com.example.ui;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main1 {

	public static void main(String[] args) throws IOException {
		byte v1 = 50;
		short v2 = 1000;
		int v3 = 56000;
		long v4 = 809990L;
		float v5 = 5.0F;
		double v6 = 865.9144;
		String v7 = "Hello";
		boolean v8 = true;
		char fullStop = '.';
		OutputStream outputStream = new FileOutputStream("MyData.dat");
		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
		dataOutputStream.writeByte(v1);
		dataOutputStream.writeShort(v2);
		dataOutputStream.writeInt(v3);
		dataOutputStream.writeLong(v4);
		dataOutputStream.writeFloat(v5);
		dataOutputStream.writeDouble(v6);
		dataOutputStream.writeUTF(v7);
		dataOutputStream.writeBoolean(v8);
		dataOutputStream.writeChar(fullStop);

	}

}
