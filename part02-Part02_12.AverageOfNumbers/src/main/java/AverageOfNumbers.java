
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int inputNum = scanner.nextInt();

            if (inputNum == 0) {
                break;
            } else {
                count++;
                sum += inputNum;
            }
        }
        double avg = sum/count;
        System.out.println("Average of the numbers: " + avg);

    }
}
