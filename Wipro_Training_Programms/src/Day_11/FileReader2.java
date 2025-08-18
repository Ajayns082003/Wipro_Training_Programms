package Day_11;

import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
	public static void main(String[] args) throws IOException {
			FileReader reader= new FileReader("C:\\Users\\ruler\\Downloads\\goat.txt");
			int ch;
			while((ch=reader.read())!=-1)
			{
				System.out.println((char) ch);
			}
			
}
}
