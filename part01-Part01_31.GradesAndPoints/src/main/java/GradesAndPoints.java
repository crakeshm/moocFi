
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int n = Integer.valueOf(scan.nextLine());
        if (n < 0) {
            System.out.println("impossible!");
        } else if (n <= 49) {
            System.out.println("failed");
        } else if (n >= 50 && n <= 59) {
            System.out.println("1");
        } else if (n >= 60 && n <= 69) {
            System.out.println("2");
        } else if (n >= 70 && n <= 79) {
            System.out.println("3");
        } else if (n >= 80 && n <= 89) {
            System.out.println("4");
        } else if (n >= 90 && n <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}