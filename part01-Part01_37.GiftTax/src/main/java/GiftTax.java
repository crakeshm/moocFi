
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int amt = scan.nextInt();
        double taxamt = 0;

        if (amt > 5000 && amt <= 25000) {
            taxamt = 100 + (amt - 5000) * 0.08;
        } else if (amt > 25000 && amt <= 55000) {
            taxamt = 1700 + (amt - 25000) * 0.1;
        } else if (amt > 55000 && amt <= 200000) {
            taxamt = 4700 + (amt - 55000) * 0.12;
        } else if (amt > 200000 && amt <= 1000000) {
            taxamt = 22100 + (amt - 200000) * 0.15;
        } else if (amt > 1000000) {
            taxamt = 142100 + (amt - 1000000) * 0.17;
        } else {
            System.out.println("No Tax!");
        }

        System.out.println("Tax: " + taxamt);

    }
}
