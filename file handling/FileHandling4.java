import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String wordToFind = input.nextLine();
        int count = 0;

        try {
            File file = new File("FileHandling1.java"); 
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String word = sc.next();
                if (word.equalsIgnoreCase(wordToFind)) {
                    count++;
                }
            }

            System.out.println("The word '" + wordToFind + "' appeared " + count + " times.");
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File 'FileHandling1.java' not found. Please check the file path.");
        }

        input.close();
    }
}
