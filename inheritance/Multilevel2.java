class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}


class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing...");
    }
}


class TeamLead extends Manager {
    void lead() {
        System.out.println("Team lead is leading the team...");
    }
}

public class Multilevel2 {
    public static void main(String[] args) {
        TeamLead lead = new TeamLead();
        lead.work();   
        lead.manage(); 
        lead.lead();   
    }
}
