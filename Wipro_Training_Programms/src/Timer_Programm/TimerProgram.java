package Timer_Programm;

import java.util.Timer;
import java.util.TimerTask;

interface Alarm{
	void ring();
}

class Eat implements Alarm {
    public void ring() {
        System.out.println("Alarm 1: Time to Eat");
    }
}

class Water implements Alarm {
    public void ring() {
        System.out.println("Alarm 2: Drink water");
    }
}

class Read implements Alarm {
    public void ring() {
        System.out.println("Alarm 3: Time  to read!");
    }
}

public class TimerProgram {
	public static void main(String[] args) {
	 
        Alarm[] alarms = new Alarm[3];
        alarms[0] = new Eat();
        alarms[1] = new Water();
        alarms[2] = new Read();

        Timer timer = new Timer();
        long interval = 5000L; 

        timer.scheduleAtFixedRate(new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                alarms[count % alarms.length].ring();
                count++;
            }
        }, 0, interval);

	}
}
