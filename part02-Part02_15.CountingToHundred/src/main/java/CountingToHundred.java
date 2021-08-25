
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        getCount( inputNum);

    }

    public static void getCount(int num) {
        int fixNum = 100;
        for (int i = num; i <= fixNum; i++) {
            System.out.println(i);
        }
    }
}
