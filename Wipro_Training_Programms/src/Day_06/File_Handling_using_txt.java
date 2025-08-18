package Day_06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Handling_using_txt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 =new File("C:\\Users\\ruler\\OneDrive\\Desktop\\Day_06.txt");
		try {
			BufferedReader br1= new BufferedReader(new FileReader(f1));
			String line=br1.readLine();
		    while(line!=null) {
		    	System.out.println("File Content :"+line);
		    	line=br1.readLine();
		    	
		    }
		   br1.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found error");
		}
		catch(IOException e) {
			System.out.println("IO error occured while reading the file");
		}
		finally {
			System.out.println("this is the complete excution");
		}
		
	}

}
