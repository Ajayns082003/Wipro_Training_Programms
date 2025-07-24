package Utility_Programs;

import java.util.Random;
public class RandomeExample3 {
	public static void main(String[] args) {
		Random r=new Random();
		int random_no = r.nextInt(1000);
		System.out.println("Random Number :"+random_no);
		
	}

}
