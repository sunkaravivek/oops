import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class UserInfoWithFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\n--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Next year, you will be " + (age + 1) + " years old.");

        // Writing to file using java.io
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("userinfo.txt"));
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Age: " + age);
            writer.newLine();
            writer.write("Next year you will be: " + (age + 1));
            writer.close();
            System.out.println("\nUser info saved to 'userinfo.txt'");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        sc.close();
    }
}
