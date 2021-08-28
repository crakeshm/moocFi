
import java.util.*;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        
        while(true){
            String str = x.nextLine();
            if(str == " "){
                break;
            }
            strings.add(str);
        }
        removeLast(strings);
    }
    
    public static void removeLast(ArrayList<String> strs){
        if(strs.isEmpty()){
            return;
        }
        strs.remove(strs.size()-1);
    }

}
