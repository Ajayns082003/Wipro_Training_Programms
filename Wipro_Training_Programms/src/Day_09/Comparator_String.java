package Day_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student7 implements Comparable<Student7> {
    public int age;
    public String name;

    public Student7(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student7 [age=" + age + ", name=" + name + "]";
    }

   
    @Override
    public int compareTo(Student7 other) {
        return this.name.compareTo(other.name);
    }
}

public class Comparator_String {
    public static void main(String[] args) {
      
        Comparator<Student7> ageComp = new Comparator<Student7>() {
            @Override
            public int compare(Student7 s1, Student7 s2) {
                return Integer.compare(s1.age, s2.age);
            }
        };

       
        List<Student7> stud = new ArrayList<>();
        stud.add(new Student7(22, "AJAY"));
        stud.add(new Student7(25, "VINAY"));
        stud.add(new Student7(23, "SUNIL"));
        stud.add(new Student7(24, "PRADEEP"));

        // Sort using Comparator (by age)
        System.out.println("Sorted by age (Comparator):");
        Collections.sort(stud, ageComp);
        for (Student7 s : stud) {
            System.out.println(s);
        }

        // Sort using Comparable (by name)
        System.out.println("\nSorted by name (Comparable):");
        Collections.sort(stud); // Uses compareTo() from Student7
        for (Student7 s : stud) {
            System.out.println(s);
        }
    }
}

