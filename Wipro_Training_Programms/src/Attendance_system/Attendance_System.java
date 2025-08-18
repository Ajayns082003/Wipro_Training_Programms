//Student Attendance

package Attendance_system;
abstract class Attendance {
String name;
boolean isPresent;

Attendance(String name) {
   this.name = name;
}

abstract void markAttendance(boolean present);
abstract void displayAttendance();
}


class StudentAttendance extends Attendance {

StudentAttendance(String name) {
   super(name);
}

@Override
void markAttendance(boolean present) {
   this.isPresent = present;
}

@Override
void displayAttendance() {
   String status = isPresent ? "Present" : "Absent";
   System.out.println(name + " is " + status);
}
}


public class Attendance_System {
public static void main(String[] args) {
   StudentAttendance s1 = new StudentAttendance("Ajay");
   StudentAttendance s2 = new StudentAttendance("Sunil");

   s1.markAttendance(true);
   s2.markAttendance(false); 

   s1.displayAttendance();
   s2.displayAttendance();
}
}

