
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
               
        while(true){
        String input = scanner.nextLine();
        
        String[] avWord = input.split(" ");
        
        for(String word : avWord ){
            if(word.contains("av")){
                System.out.println(word);
            } 
        }
            
           if(input.equals("")){
               break;
           } 
            
            
        }
                
    }
}
