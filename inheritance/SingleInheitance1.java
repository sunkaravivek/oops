// Parent class Room
class Room {
    double length;
    double width;
    double height;

    // Constructor for Room class
    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

// Child class RoomDetails inheriting from Room
class RoomDetails extends Room {

    // Constructor for RoomDetails class
    public RoomDetails(double length, double width, double height) {
        // Calling the parent class constructor
        super(length, width, height);
    }

    // Method to calculate the area of the room (length * width)
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the volume of the room (length * width * height)
    public double calculateVolume() {
        return length * width * height;
    }
}

public class SingleInheitance1 {
    public static void main(String[] args) {
        // Create an object of RoomDetails with length=5, width=4, height=3
        RoomDetails room = new RoomDetails(5, 4, 3);

        // Calculate and display the area of the room
        double area = room.calculateArea();
        System.out.println("Area of the room: " + area + " square units.");

        // Calculate and display the volume of the room
        double volume = room.calculateVolume();
        System.out.println("Volume of the room: " + volume + " cubic units.");
    }
}
