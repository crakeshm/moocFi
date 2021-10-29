
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner read = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.println("Title ? ");
            String title = read.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("pages ? ");
            int pages = Integer.valueOf(read.nextLine());

            System.out.println("publication year ? ");
            int publicationYear = Integer.valueOf(read.nextLine());

            books.add(new Books(title, pages, publicationYear));
        }

        System.out.println("What Output? ");
        String output = read.nextLine();

        switch (output) {
            case "everything":
                for (Books e : books) {
                    System.out.println(e);
                }
                break;
            case "name":
                for (Books e : books) {
                    System.out.println(e.getTitle());
                }
                break;
            default:
                System.out.println("no results");

        }

    }

}
