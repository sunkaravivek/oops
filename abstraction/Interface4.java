
interface Employee {
    void getEmployeeDetails();
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    private String name;
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Full-Time Employee: " + name);
    }

    @Override
    public double calculateSalary() {
        return salary; 
    }
}

class PartTimeEmployee implements Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Part-Time Employee: " + name);
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; 
    }
}

public class Interface4 {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("muzz", 50000);
        Employee emp2 = new PartTimeEmployee("deva", 20, 120);

        emp1.getEmployeeDetails();
        System.out.println("Salary: $" + emp1.calculateSalary());

        emp2.getEmployeeDetails();
        System.out.println("Salary: $" + emp2.calculateSalary());
    }
}
