class Person {
    private String name;  // Private variable
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String newName) {
        this.name = newName;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int newAge) {
        if (newAge > 0) { // Ensuring age is positive
            this.age = newAge;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

// Main class
public class Encapsulation1 {
    public static void main(String[] args) {
        Person person = new Person();

        // Setting values using setter methods
        person.setName("roopesh");
        person.setAge(19);

        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
