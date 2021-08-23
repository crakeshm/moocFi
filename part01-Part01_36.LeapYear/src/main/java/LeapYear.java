
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        String msg ="";
        int year = scan.nextInt();
        if(year % 100 == 0){
            if(year % 400==0 ){
                msg = "The year is a leap year.";
            } else{
                msg = "The year is not a leap year.";
            }
        } else if(year % 4 == 0) {
            msg = "The year is a leap year.";
        } else{
            msg = "The year is not a leap year.";
        }
        
        System.out.println(msg);
    }
}
