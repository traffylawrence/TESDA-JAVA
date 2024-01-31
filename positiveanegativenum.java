
import java.util.Scanner;

public class positiveanegativenum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[] numbers = new double[10]; //store numbers to array

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scan.nextDouble();
        }
        scan.close();
        // Display output
        System.out.println("Numbers and their classification:");
        for (int i = 0; i < 10; i++) {
            int num = (int) numbers[i]; //turns double to int
            System.out.print(num + " is ");
            if (num < 0) {
                System.out.println("negative.");
            } else if (num > 0) {
                System.out.println("positive.");
            } else {
                System.out.println("zero.");
            }
        }
    }
}
