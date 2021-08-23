
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int n = Integer.valueOf(scan.nextLine());
        // Write your program here        
        if(n == 1984){
            System.out.println("Orwell");
        }
    }
}
