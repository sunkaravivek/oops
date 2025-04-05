import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling1 {
    public static void main(String[] args) {
        try {
            File file = new File("exampl.txt");
            Scanner reader = new Scanner(file);
            System.out.println("Reading content from example.txt:\n");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
