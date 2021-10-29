
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String firstname = scanner.nextLine();
        if(firstname.isEmpty()){
            break;
        }
        String lastname = scanner.nextLine();
        String idNo = scanner.nextLine();
        
        infoCollection.add(new PersonalInformation(firstname,lastname,idNo));    
        
    }
        
       for(PersonalInformation e:infoCollection){
           System.out.println(e.getFirstName() + " " + e.getLastName()); 
       }

    }
}
