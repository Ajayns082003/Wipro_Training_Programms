package Day_09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student3 implements Serializable{
	private String name;
	private int age;
	public Student3(String name, int age) {
		super();
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student3() {
		super();
	}
	
}

public class Serialzation  {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Student3 s3= new Student3();
	
	s3.setName("AJAY");
	s3.setAge(22);
	
	FileOutputStream out = new FileOutputStream("C:\\Users\\ruler\\OneDrive\\Desktop\\Day_06.txt");
	ObjectOutputStream output= new ObjectOutputStream(out);
	output.writeObject(s3);
	System.out.println("Code Encrypted");
	out.close();
	output.close();
	
	FileInputStream in= new FileInputStream("C:\\Users\\ruler\\OneDrive\\Desktop\\Day_06.txt");
	ObjectInputStream input = new ObjectInputStream(in);
	Student3 s4 =(Student3)input.readObject();
	System.out.println("Reading the data");
	in.close();
	input.close();
	}
}
