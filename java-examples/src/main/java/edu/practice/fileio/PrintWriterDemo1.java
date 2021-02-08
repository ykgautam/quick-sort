package edu.practice.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\yash\\Desktop\\data1.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(97);
		pw.println(100);
		pw.println(101.56);
		pw.println("yash gautam");
		pw.flush();
		pw.close();
	}

}
