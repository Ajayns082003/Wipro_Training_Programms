package Day_11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BufferedWriteFile {
	public static void main(String[] args) throws IOException {
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\ruler\\Downloads\\10.txt"));
		br.write("Adding new Content");
		br.newLine();
		br.close();
		System.out.println("Content added successfully");
	}

}
