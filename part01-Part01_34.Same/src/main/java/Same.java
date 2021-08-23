
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string");
        String ip1 = scan.nextLine();
        System.out.println("Enter the second string");
        String ip2 = scan.nextLine();
        
        String msg = ip1.equals(ip2) ? "Same":"Different";
        System.out.println(msg);
        
    }
}
