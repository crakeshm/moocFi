
import java.nio.file.Paths;
import java.util.*;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        //Read file
        try (Scanner readFile = new Scanner(Paths.get(file))) {

            while (readFile.hasNextLine()) {
                String name = readFile.nextLine();
                list.add(name);
            }
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();

            if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not Found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed");
        }

    }
}
