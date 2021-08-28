
import java.util.*;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        Scanner read = new Scanner(System.in); 
        while(true){
            int num = read.nextInt();
            if(num == -1){
                break;
            }
         list.add(num);
        }
        sum(list);
    }
    
    public static int sum(ArrayList<Integer> numbers){
        int sumOfAll = 0;
        for(int num : numbers){
            sumOfAll += num;
        }
        return sumOfAll;
    }

}
