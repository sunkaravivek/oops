class Vehicle {
    String make;
    String model;

        public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    
    public void start() {
        System.out.println("The " + make + " " + model + " is starting.");
    }

    
    public void stop() {
        System.out.println("The " + make + " " + model + " is stopping.");
    }
}


class Car extends Vehicle {

        public Car(String make, String model) {
             super(make, model);
        }

    public void drive() {
        System.out.println("The " + make + " " + model + " is now driving.");
    }
}

public class SingleInheritance2 {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", "Corolla");

        
        car.start();  
        car.drive();  
        car.stop();  
    }
}
