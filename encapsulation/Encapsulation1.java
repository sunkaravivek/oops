class Person {
    private String name;  
    private int age;

        public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int newAge) {
        if (newAge > 0) { 
            this.age = newAge;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Person person = new Person();

        
        person.setName("roopesh");
        person.setAge(19);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
