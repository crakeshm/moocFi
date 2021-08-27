
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
    System.out.println("From where: ");
    int idx1 = scanner.nextInt();
    System.out.println("To where: ");
    int idx2 = scanner.nextInt();   
    
    for(int i =idx1; i<= idx2;i++){
        System.out.println(numbers.get(i));
    }

    }
}
