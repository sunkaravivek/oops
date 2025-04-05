import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling3 {
    public static void main(String[] args) {
        String fileName = "FileHandling1.java";
        int lineCount = 0, wordCount = 0, charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.length();
            }

            System.out.println("File: " + fileName);
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
            e.printStackTrace();
        }
    }
}
