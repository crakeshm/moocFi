
import java.util.*;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> count = new ArrayList<>();

        while (true) {
            String string = scanner.nextLine();
            if (string.equals("end")) {
                break;
            }
            count.add(string);
        }
        System.out.println(count.size());

    }
}
