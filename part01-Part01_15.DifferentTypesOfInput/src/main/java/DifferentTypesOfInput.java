
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
//        System.out.println("Give a string:");
//        String var1 = scan.nextLine();
//        
//        System.out.println("Give an integer:");
//        String var2 = scan.nextLine();
//        
//        System.out.println("Give a double:");
//        String var3 = scan.nextLine();
//        
//        System.out.println("Give a boolean:");
//        String var4 = scan.nextLine();
//        
//        System.out.println("You gave the string " + String.valueOf(var1));
//        System.out.println("You gave the integer " + Integer.valueOf(var2));
//        System.out.println("You gave the double " + Double.valueOf(var3));
//        System.out.println("You gave the boolean " + Boolean.valueOf(var4));

        int i;
        String s;
        boolean b;
        double d;

        System.out.println("Give a string:");
        s = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        i = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        d = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        b = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + s);
        System.out.println("You gave the integer " + i);
        System.out.println("You gave the double " + d);
        System.out.println("You gave the boolean " + b);
    }
}
