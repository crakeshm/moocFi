
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int ipNum =scanner.nextInt();
        
        getFactorial(ipNum);
    }

    private static void getFactorial(int ipNum) {
        int factorial =1;
        for(int i=1; i<=ipNum; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
