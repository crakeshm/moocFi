
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int n = Integer.valueOf(scan.nextLine());
        String msg = (n>=18) ? "You are an adult" : "You are not an adult";
        System.out.println(msg);
    }
}
