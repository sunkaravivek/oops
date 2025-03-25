
class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Generic vehicle engine started.");
    }

    public String getInfo() {
        return make + " " + model;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", " + numberOfDoors + " doors";
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String make, String model, boolean hasSideCar) {
        super(make, model);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Sidecar: " + hasSideCar;
    }
}

public class Overriding2 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 4);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", false);

        car.startEngine();
        System.out.println(car.getInfo());

        motorcycle.startEngine();
        System.out.println(motorcycle.getInfo());
    }
}