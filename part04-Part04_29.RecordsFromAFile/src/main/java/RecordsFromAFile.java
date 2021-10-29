
import java.nio.file.Paths;
import java.util.*;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] parts = line.split(",");
                System.out.println(parts[0]+", age: "+ parts[1] +" years");
                
            }
            
            
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

}
