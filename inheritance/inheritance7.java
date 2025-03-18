// Base class (Parent)
class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Subclass 1 - Inherits from Vehicle
class Car extends Vehicle {
    int numDoors;

    public Car(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    public void displayCarInfo() {
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Subclass 2 - Inherits from Vehicle
class Bike extends Vehicle {
    String typeOfBike;

    public Bike(String brand, String model, String typeOfBike) {
        super(brand, model);
        this.typeOfBike = typeOfBike;
    }

    public void displayBikeInfo() {
        System.out.println("Type of Bike: " + typeOfBike);
    }
}

// Hybrid Class - Inherits from both Car and Bike
class ElectricCar extends Car {
    Bike bike;
    int batteryCapacity;

    public ElectricCar(String brand, String model, int numDoors, String typeOfBike, int batteryCapacity) {
        super(brand, model, numDoors);
        this.bike = new Bike(brand, model, typeOfBike); // Adding Bike part to ElectricCar
        this.batteryCapacity = batteryCapacity;
    }

    public void displayElectricCarInfo() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void displayHybridInfo() {
        displayInfo();
        displayCarInfo();
        bike.displayBikeInfo();
        displayElectricCarInfo();
    }
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model X", 4, "Mountain", 75);

        // Calling methods from various classes
        electricCar.displayHybridInfo();
    }
}
