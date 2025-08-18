package Day_06;

import java.util.Random;
public class My_Learning_Course2_Assesment_01 {
public static void main(String[] args) {
	long random10Digit= generateTenDigitNumber();
	System.out.println("Random 10-Digit Number: "+random10Digit);
}

public static long generateTenDigitNumber() {
	Random r = new Random();
	long min =1000000000L;
	long max =9999999999L;
	
	long random10Digit = min +((long)(r.nextDouble() *  (max-min+1)));
	return random10Digit;
			
}
}
