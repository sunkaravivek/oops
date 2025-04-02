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

class ElectricCar extends Car {
    Bike bike;
    int batteryCapacity;

    public ElectricCar(String brand, String model, int numDoors, String typeOfBike, int batteryCapacity) {
        super(brand, model, numDoors);
        this.bike = new Bike(brand, model, typeOfBike); 
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

public class HybridInheritance1 {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model X", 4, "Mountain", 75);

                electricCar.displayHybridInfo();
    }
}
