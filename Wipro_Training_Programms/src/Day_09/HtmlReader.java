package Day_09;

import java.io.*;

public class HtmlReader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ruler\\Downloads\\a1.html"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("<h1>")) {
                    String text = line.substring(line.indexOf("<h1>") + 4, line.indexOf("</h1>"));
                    System.out.println("H1: " + text);
                }
                if (line.contains("<p>")) {
                    String text = line.substring(line.indexOf("<p>") + 3, line.indexOf("</p>"));
                    System.out.println("Paragraph: " + text);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

