
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int n = Integer.valueOf(scan.nextLine());
//        if(n>0){
//            System.out.println("The number is positive.");
//        } else {
//            System.out.println("The number is not positive");
//        }
        String msg = (n>0) ? "The number is positive." : "The number is not positive.";
        System.out.println(msg);
    }
}
