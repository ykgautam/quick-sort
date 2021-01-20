package edu.practice.fileio;

/**
 * file extraction 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileExtraction {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("final.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("list1.txt"));
		String line1 = br1.readLine();
		while (line1 != null) {
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
			String line2 = br2.readLine();

			while (line2 != null) {
				if (line1.equals(line2)) {
					available = true;
					break;
				}
				line2 = br2.readLine();
			}
			br2.close();
			if (available == false)
				pw.println(line1);
			line1 = br1.readLine();
		}
		pw.flush();
		br1.close();
		pw.close();
	}
}
