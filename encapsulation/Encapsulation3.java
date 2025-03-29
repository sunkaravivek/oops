class Car {
    private String model;
    private String brand;
    private int speed;

    
    public Car(String model, String brand, int speed) {
        this.model = model;
        this.brand = brand;
        this.speed = speed;
    }

    
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 300) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be between 0 and 300 km/h.");
        }
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Car car = new Car("Model S", "Tesla", 200);

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Speed: " + car.getSpeed() + " km/h");

        
        car.setSpeed(350);  
        car.setSpeed(250);  

        System.out.println("Updated Car Speed: " + car.getSpeed() + " km/h");
    }
}
