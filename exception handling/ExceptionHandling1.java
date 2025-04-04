import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Username: ");
            String user = sc.nextLine();

            System.out.print("Password: ");
            String pass = sc.nextLine();

            if (user.isEmpty() || pass.isEmpty()) {
                throw new IllegalArgumentException("Username/Password cannot be empty");
            }

            if (user.equals("admin") && pass.equals("admin123")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid credentials.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Login Error: " + e.getMessage());
        }

        sc.close();
    }
}

