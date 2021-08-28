
import java.util.*;
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        Scanner scan = new Scanner(System.in);
        int lowerLimit = scan.nextInt();
        int upperLimit = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scan.nextInt();
            if (input == 00) {
                break;
            }
            list.add(input);
        }
//        System.out.println("list"+list);
        printNumbersInRange(list, lowerLimit, upperLimit);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        numbers.sort(null);
//        System.out.println("sorted arraylist" + numbers);
        for (int i = 0; i <= numbers.size()-1; i++) {
//            System.out.println("at i= "+ i + " number: "+ numbers.get(i)+" lower = "+ lowerLimit+ " upper=  "+upperLimit);
         if( numbers.get(i)>= lowerLimit && numbers.get(i)<= upperLimit){
             System.out.println(numbers.get(i));
         }  
        }
    }
}
