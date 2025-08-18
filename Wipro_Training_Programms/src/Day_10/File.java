package Day_10;

import java.io.FileWriter;
import java.io.IOException;

public class File {
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("C:\\Users\\ruler\\Downloads\\10.txt");
			
			writer.write("Hello, Iam trying to find testing tools for Wipro projects\n");
			writer.write("Tools like Automation and Performance tools\n");
			
			writer.close();
			
			System.out.println("Data Written to file successfully");
		}
		catch(IOException e) {
			System.out.println("An errpr occured while writing to th file");
			e.printStackTrace();
		}
	}

}
