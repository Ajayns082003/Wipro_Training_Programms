/* Abstract class - Employee Payroll System*/

package Day_02;

abstract class Employe {
    String name;
    int empId;

    public Employe(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

 
    abstract double calculateSalary();

  
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employe {
    double monthlySalary;

    public FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employe {
    int hoursWorked;
    double ratePerHour;

    public PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Employe e1 = new FullTimeEmployee("Chetan", 101, 50000);
        Employe e2 = new PartTimeEmployee("Gagan", 102, 80, 300);

        e1.display();
        System.out.println("Salary: ₹" + e1.calculateSalary());

        System.out.println();

        e2.display();
        System.out.println("Salary: ₹" + e2.calculateSalary());
    }
}
