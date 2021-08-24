
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        int count = 0;
        
        while(true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            
            if(n==0){
                break;
            } else{
                count = count + n;
            }
        }
        System.out.println("Sum of the numbers: "+count);
    }
}
