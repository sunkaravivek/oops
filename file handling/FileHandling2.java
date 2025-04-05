
import java.io.*;
import java.util.*;

public class FileHandling2 {
    static final String FILE_NAME = "users.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Register\n2. Login");
        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            try {
                FileWriter fw = new FileWriter(FILE_NAME, true);
                fw.write(user + "," + pass + "\n");
                fw.close();
                System.out.println("User registered!");
            } catch (IOException e) {
                System.out.println("Error writing to file.");
            }

        } else if (choice == 2) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            boolean loggedIn = false;
            try {
                File file = new File(FILE_NAME);
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String[] credentials = reader.nextLine().split(",");
                    if (credentials[0].equals(user) && credentials[1].equals(pass)) {
                        loggedIn = true;
                        break;
                    }
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file.");
            }

            if (loggedIn) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }
}
