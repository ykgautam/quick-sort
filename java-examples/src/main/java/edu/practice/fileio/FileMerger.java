package edu.practice.fileio;

/**
 * merging data from 2 files into a third file
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));

		String line = br1.readLine();
		while (line != null) {
			pw.println(line);
			line = br1.readLine();
		}
		br1.close();
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		line = br2.readLine();
		while (line != null) {
			pw.println(line);
			line = br2.readLine();
		}
		pw.flush();
		br2.close();
		pw.close();

	}
}
