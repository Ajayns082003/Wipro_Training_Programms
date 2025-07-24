package Utility_Programs;

import java.util.Calendar;
public class CalenderExample7 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Current Date and Time :"+calendar.getTime());
		
		calendar.set(Calendar.YEAR, 2025);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DAY_OF_MONTH, 15);
		
		System.out.println("Specific Date(January 15, 2025):"+calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Date after adding 10 days: " + calendar.getTime());
       
        calendar.add(Calendar.MONTH, -1);
        System.out.println("Date after subtracting 1 month: " + calendar.getTime());
    }
	}

