
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int sum = 0, count = 0, evenCount = 0, oddCount =0;
        double avg;
        while (true) {
            int inputNum = scanner.nextInt();

            if (inputNum == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                sum += inputNum;
                count++;
                if(inputNum %2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        avg = (1.0 * sum)/count;
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: "+ oddCount);
    }
}
