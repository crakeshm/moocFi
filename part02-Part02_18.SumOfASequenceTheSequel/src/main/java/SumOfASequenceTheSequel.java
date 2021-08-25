
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int firstNum = scanner.nextInt();

        System.out.println("Second number?");
        int secondNum = scanner.nextInt();

        getSum(firstNum, secondNum);
    }

    public static void getSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
