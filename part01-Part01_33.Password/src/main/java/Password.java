
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        String pass = "Caput Draconis";
        System.out.println("Password?");
        String ip = scan.nextLine();
        String msg = (pass.equals(ip)) ? "Welcome!":"Off with you!";
        System.out.println(msg);

    }
}
