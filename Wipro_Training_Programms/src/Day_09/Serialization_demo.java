package Day_09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{	
	private int rollno;
	private String name;
	
	public Student1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public Student1() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class  Serialization_demo{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	      try {
	            
	            Student1 std1 = new Student1();
	            std1.setRollno(1);
	            std1.setName("AJAY");

	            // Serialize object
	            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\ruler\\Downloads\\HE110.txt");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(std1);
	            out.close();
	            fileOut.close();

	            System.out.println("Serialized data saved in file.");

	            // Deserialize object
	            FileInputStream fileIn = new FileInputStream("C:\\Users\\ruler\\Downloads\\HE110.txt");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            Student1 std2 = (Student1) in.readObject();
	            in.close();
	            fileIn.close();

	            // Output deserialized data
	            System.out.println("Deserialized Student:");
	            System.out.println("Roll No: " + std2.getRollno());
	            System.out.println("Name: " + std2.getName());

	        } catch (IOException | ClassNotFoundException e) {
	        	System.out.println("File not found");
	     }         
	}
}

