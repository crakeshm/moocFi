
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum, count = 0;
        double sum = 0;

        while (true) {

            inputNum = scanner.nextInt();
            if (inputNum == 0) {
                if (sum == 0) {
                    System.out.println("Cannot calculate the average");
                }
                break;
            } else if (inputNum > 0) {
                count++;
                sum += inputNum;
            } else {
                System.out.println("Cannot calculate the average");
            }
        }
        double avg = sum / count;
        if (avg >= 0) {
            System.out.println(avg);
        }
    }

}
