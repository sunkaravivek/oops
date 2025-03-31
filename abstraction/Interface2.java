import java.util.Scanner;


interface Rentable {
    void displayInfo(); 
}


class Car implements Rentable {
    private String brand;
    private String model;
    private double rentalPrice;
    private String fuelType;

    
    public Car(String brand, String model, double rentalPrice, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.fuelType = fuelType;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("\nVehicle Rental Information:");
        System.out.println("Type: Car");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: $" + rentalPrice + " per day");
        System.out.println("Fuel Type: " + fuelType);
    }
}


class Bike implements Rentable {
    private String brand;
    private String model;
    private double rentalPrice;
    private int engineCapacity;

    
    public Bike(String brand, String model, double rentalPrice, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.engineCapacity = engineCapacity;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("\nVehicle Rental Information:");
        System.out.println("Type: Bike");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: $" + rentalPrice + " per day");
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}


public class Interface2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Vehicle Type (1 for Car, 2 for Bike): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.println("Enter Model: ");
        String model = scanner.nextLine();

        System.out.println("Enter Rental Price per day: ");
        double rentalPrice = scanner.nextDouble();
        scanner.nextLine(); 

        Rentable vehicle; 

        if (choice == 1) {
            System.out.println("Enter Fuel Type: ");
            String fuelType = scanner.nextLine();
            vehicle = new Car(brand, model, rentalPrice, fuelType);
        } else if (choice == 2) {
            System.out.println("Enter Engine Capacity (cc): ");
            int engineCapacity = scanner.nextInt();
            vehicle = new Bike(brand, model, rentalPrice, engineCapacity);
        } else {
            System.out.println("Invalid choice! Please enter 1 for Car or 2 for Bike.");
            scanner.close();
            return;
        }

        
        vehicle.displayInfo();

        scanner.close();
    }
}
