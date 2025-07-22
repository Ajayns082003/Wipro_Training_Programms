package Java_Day_01;

public class Clacultor_RuntimeData {
	
		public int add(int a, int b){
			return a+b;
		}
	public static void main(String[] args) {
		Clacultor_RuntimeData c = new Clacultor_RuntimeData();
		int sum =c.add(3, 4);
		System.out.println("Sum ="+sum);
	}	

}
