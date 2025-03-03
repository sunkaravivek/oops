public class Multiplicationtable {
    public static void main(String[] args) {
        // Loop through numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            
            // Loop for multiples of the current number (i)
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println(); // Print a blank line between tables
        }
    }
}