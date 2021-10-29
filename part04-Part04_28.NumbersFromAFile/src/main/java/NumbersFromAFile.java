
import java.nio.file.Paths;
import java.util.*;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numRange = new ArrayList<>();
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                int num = Integer.valueOf(readFile.nextLine());
                numRange.add(num);
            }
            numRange.sort(null);
            int count = 0;
            for (int i = 0; i < numRange.size(); i++) {
               int temp = numRange.get(i);
               if(temp >= lowerBound && temp <= upperBound){
                   count++;
               }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

}
