import java.util.Scanner;

// Base Class
class Vehicle {
    String brand;
    String model;
    double rental_price;

    // Constructor
    public Vehicle(String brand, String model, double rental_price) {
        this.brand = brand;
        this.model = model;
        this.rental_price = rental_price;
    }

    // Method to display vehicle information
    public void display_Info() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: $" + rental_price + " per day");
    }
}

// Derived Class for Car
class Car extends Vehicle {
    String fuel_Type;

    // Constructor
    public Car(String brand, String model, double rental_price, String fuel_Type) {
        super(brand, model, rental_price);
        this.fuel_Type = fuel_Type;
    }

    // Overriding display_Info() method
    @Override
    public void display_Info() {
        super.display_Info();
        System.out.println("Fuel Type: " + fuel_Type);
    }
}

// Derived Class for Bike
class Bike extends Vehicle {
    int engine_Capacity;

    // Constructor
    public Bike(String brand, String model, double rental_price, int engine_Capacity) {
        super(brand, model, rental_price);
        this.engine_Capacity = engine_Capacity;
    }

    // Overriding display_Info() method
    @Override
    public void display_Info() {
        super.display_Info();
        System.out.println("Engine Capacity: " + engine_Capacity + "cc");
    }
}

// Main Class
public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Vehicle Type (1 for Car, 2 for Bike): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.println("Enter Model: ");
        String model = scanner.nextLine();

        System.out.println("Enter Rental Price per day: ");
        double rental_price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.println("Enter Fuel Type: ");
            String fuel_Type = scanner.nextLine();
            Car car = new Car(brand, model, rental_price, fuel_Type);
            System.out.println("\nVehicle Rental Information:");
            car.display_Info();
        } else if (choice == 2) {
            System.out.println("Enter Engine Capacity (cc): ");
            int engine_Capacity = scanner.nextInt();
            Bike bike = new Bike(brand, model, rental_price, engine_Capacity);
            System.out.println("\nVehicle Rental Information:");
            bike.display_Info();
        } else {
            System.out.println("Invalid choice! Please enter 1 for Car or 2 for Bike.");
        }

        scanner.close();
    }
}