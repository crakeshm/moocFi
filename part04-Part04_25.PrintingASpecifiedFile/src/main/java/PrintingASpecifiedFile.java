
import java.nio.file.Paths;
import java.util.*;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        try (Scanner read = new Scanner(Paths.get(fileName))) {
            while (read.hasNextLine()) {
                
                String line = read.nextLine();
                
                System.out.println(line);
            }
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        }

    }
}
