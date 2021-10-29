
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        
        
        
        try (Scanner fileread = new Scanner(Paths.get(file))) {
            while (fileread.hasNextLine()) {
                String row = fileread.nextLine();
                String rowDetails[] = row.split(",");
                String name = rowDetails[0];
                String opponent = rowDetails[1];
                int selfScore = Integer.valueOf(rowDetails[2]);
                int oppScore = Integer.valueOf(rowDetails[3]);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
