package Day_05;

import java.util.ArrayList;

abstract class Timer {
	 abstract void remindTasks();
	}

	class DailyTaskReminder extends Timer03 {
	   public void remindTasks() {
	       ArrayList<String> tasks = new ArrayList<>() {{
	           add("Wake Up");
	           add("Do Java Programs");
	           add("Tea Break");
	           add("Complete Tasks");
	           add("LUNCH");
	          
	       }};
	       double[] times = {7.00, 8.00, 8.40, 9.00, 12.00};
	       System.out.println(" Daily Task Reminder \n");
	       for (int i = 0; i < tasks.size(); i++) {
	           String pmAm = (times[i] >= 1 && times[i] <= 9) || times[i] > 12 ? "AM" : "PM";
	          
				System.out.printf("Time: %.2f %s\n", times[i], pmAm);
	           System.out.println(" Task: " + tasks.get(i));
	          
	       }
	   }
	}
	public class Timer03 {
	   public static void main(String[] args) {
	       new DailyTaskReminder().remindTasks();
	   }
	}

