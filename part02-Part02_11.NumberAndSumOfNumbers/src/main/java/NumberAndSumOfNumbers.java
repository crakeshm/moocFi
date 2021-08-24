
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count =0, sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int inputNum = Integer.valueOf(scanner.nextLine());
            
            if(inputNum == 0){
                break;
            } else {
                count ++;
                sum = sum + inputNum;
            }
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: "+sum);
    }
}
