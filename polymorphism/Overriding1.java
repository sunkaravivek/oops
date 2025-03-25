
class Employee {
    public double calculateSalary() {
        return 50000.0; 
    }

    public String getJobDescription(){
        return "General Employee";
    }
}

class Manager extends Employee {
    
    public double calculateSalary() {
        return 100000.0;
    }

    public String getJobDescription(){
        return "Manager of department";
    }
}

class Developer extends Employee {
   
    public double calculateSalary() {
        return 80000.0;
    }
  
    public String getJobDescription(){
        return "Software Developer";
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();
        System.out.println("Manager salary: " + manager.calculateSalary());
        System.out.println("Developer salary: " + developer.calculateSalary());
        System.out.println(manager.getJobDescription());
        System.out.println(developer.getJobDescription());
    }
}