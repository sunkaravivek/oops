
abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary(); 

    void displayEmployeeDetails() { 
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}


class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary; 
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


public class AbstractClass3{
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("roopesh", 101, 50000);
        emp1.displayEmployeeDetails();
        System.out.println("Salary: $" + emp1.calculateSalary());

        Employee emp2 = new PartTimeEmployee("guna", 102, 20, 120);
        emp2.displayEmployeeDetails();
        System.out.println("Salary: $" + emp2.calculateSalary());
    }
}
