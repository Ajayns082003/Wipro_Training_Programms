package Day_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadFile {
public static void main(String[] args) throws IOException {
	BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\ruler\\Downloads\\10.txt"));
	int ch;
	while((ch=bw.read())!=-1)
	{
		System.out.println((char) ch);
	}

}
}
