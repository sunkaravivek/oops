
abstract class Vehicle {
    abstract void start(); 

    void fuelType() { 
        System.out.println("Most vehicles use petrol or diesel.");
    }
}


class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or push button.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start or kick.");
    }
}

public class AbstractClass2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();  
        car.fuelType(); 

        Vehicle bike = new Bike();
        bike.start();  
        bike.fuelType(); 
    }
}
