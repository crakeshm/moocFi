
import java.util.*;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
       

        while (true){
            String input = scanner.nextLine(); //input name,age 
            String[] details = input.split(","); //split name and age
            
            //store input name,age in separate buckets - arraylist
            name.add(details[0]);
            age.add(Integer.valueOf(details[1]));
            
            //break the user input loop            
            if (details.equals("z")) {
                break;
            }
           
        }
        
         //find the maximum age from the input above:
         int maxAge = age.get(0);
        for (int i=0;i<age.size();i++) {
            if (age.get(i) > maxAge) {
                maxAge = age.get(i);
            }
            System.out.println("age " + age.get(i) +" max "+maxAge);
        }
        System.out.println("Age of the oldest: " + maxAge);
    }
}
