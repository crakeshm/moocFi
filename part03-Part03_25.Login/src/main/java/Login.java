
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter username: ");
        String usr = x.nextLine();
        System.out.println("Enter password: ");
        String pass = x.nextLine();
        comparePass(usr, pass);
    }
    
    public static void comparePass(String usr, String pass){
        if( (usr.equals("alex") && pass.equals("sunshine") || (usr.equals("emma") && pass.equals("haskell")))){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
