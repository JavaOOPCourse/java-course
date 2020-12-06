import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scan.nextLine();
        System.out.println(fileName);
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            int lineCount = 0;
            int totalCharacterCount = 0;
            int totalWordCount = 0;

            line = br.readLine();
            while (line != null) {
                String[] words = line.split(" ");

                lineCount++;
                totalCharacterCount += line.length();
                totalWordCount += words.length;

                line = br.readLine();
            }

            System.out.println("Line count: " + lineCount);
            System.out.println("Character count: " + totalCharacterCount);
            System.out.println("Word count: " + totalWordCount);
        } catch(FileNotFoundException ex) {
            System.out.println("FileNotFound:  " + ex.toString());
        } catch(IOException ex) {
            System.out.println("IOException: " + ex.toString());
        } finally {
            System.out.println("Finally");
        }
    }
}
