package Day_06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Handling_Using_CSV {
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\ruler\\OneDrive\\Desktop\\Book1.csv");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f1));
			String line= br.readLine();
			while(line!=null) {
				System.out.println("File content :"+line);
				line = br.readLine();
			}
			br.close();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
		catch (IOException e1) {
			// TODO: handle exception
			System.out.println("IO Error occured while reading the file");
		}
		
		finally {
			System.out.println("this is the complete excuetion");
		}
	
	}

}
