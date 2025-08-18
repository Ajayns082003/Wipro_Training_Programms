package Day_05;

import java.util.Timer;
import java.util.TimerTask;

public class Timer04 {
    public static void main(String[] args) {
        String[] tasks = {
            "Work out",
            "Breakfast",
            "Practice code",
            "Complete your Lunch",
            "Practice Codes"
        };

        Timer timer = new Timer();

        // Schedule each task after hour
        for (int i = 0; i < tasks.length; i++) {
            String task = tasks[i];
            long delay = i * 60 * 60 * 1000L; 

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Reminder: " + task);
                }
            }, delay);
        }

        System.out.println("Task scheduling started! Tasks will remind you every hour.");
    }
}
