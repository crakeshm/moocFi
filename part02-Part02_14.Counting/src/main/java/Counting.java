
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.valueOf(scanner.nextLine());
        Counting.printNum(inputNum);
    }

    public static void printNum(int num) {

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
