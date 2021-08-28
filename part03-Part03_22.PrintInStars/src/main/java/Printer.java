
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0; i <= array.length - 1; i++) {
            printStar(array[i]);

        }
    }

    public static void printStar(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
