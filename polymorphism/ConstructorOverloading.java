class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

        public Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.department = "Not Assigned";
        this.salary = 0.0;
    }

    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.department = "Not Assigned";
        this.salary = 30000.0; // Default salary
    }

    
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = 40000.0; 
    }

    
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("--------------------------");
    }
}


public class ConstructorOverloading {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Alice", 101);
        Employee emp3 = new Employee("Bob", 102, "HR");
        Employee emp4 = new Employee("Charlie", 103, "IT", 55000.0);

        
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();
        emp4.displayEmployeeInfo();
    }
}
