import java.io.BufferedReader;
import java.io.FileReader;

public class Find {

    public static void main(String[] args) {
        String reservedWord = args[0];

        try {
            for (int i = 1; i < args.length; i++) {
                String fileName = args[i];

                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);

                String line = br.readLine();
                while (line != null) {
                    boolean contains = line.contains(reservedWord);

                    if (contains) {
                        System.out.printf("%s: %s%n", args[i], line);
                    }
                    line = br.readLine();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
