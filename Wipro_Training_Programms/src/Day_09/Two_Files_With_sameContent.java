package Day_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Two_Files_With_sameContent {

    public static void main(String[] args) {
        String f1 = "file1.txt";
        String f2 = "file2.txt";

        boolean b = compareFiles(f1, f2);
        if (b) {
            System.out.println("Files are same.");
        } else {
            System.out.println("Files are different.");
        }
    }

    public static boolean compareFiles(String p1, String p2) {
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\ruler\\Downloads\\goat.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\ruler\\Downloads\\10.txt"));
        ) {
            String l1, l2;
            int numline = 1;

            while ((l1 = reader1.readLine())!= null && (l2 = reader2.readLine())!= null) {
                if (!l1.equals(l2)) {
                    return false;
                }
                numline++;
            }

            if (reader1.readLine() != null || reader2.readLine() != null) {
                return false;
            }

            return true;

        } catch (IOException e) {
            System.out.println("An error occurred while comparing files: " + e.getMessage());
            return false;
        }
    }
}

