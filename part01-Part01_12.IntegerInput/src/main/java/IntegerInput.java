
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        //int number = Integer.valueOf(message);
        System.out.println("You gave the number " + number);

    }
}
