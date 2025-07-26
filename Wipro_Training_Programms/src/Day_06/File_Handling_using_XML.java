package Day_06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Handling_using_XML {
    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader br = null;

        try {
            File file = new File("C:\\Users\\ruler\\Downloads\\new 1.xml"); 
            reader = new FileReader(file);
            br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); 
            }

        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
        
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } 
        
        finally {
            System.out.println("Program finished.");
        }
    }
}
