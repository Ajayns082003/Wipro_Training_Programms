package Day_11;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
	public static void main(String[] args) throws IOException {
		String content= "This is text writefile";
		
		FileWriter writer1=new FileWriter("C:\\Users\\ruler\\Downloads\\goat.txt");
		{
		writer1.write(content);
		writer1.close();
	
	System.out.println("Content written successfully done ");

		}
		}

}
