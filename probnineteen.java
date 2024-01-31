import java.util.Scanner;
public class probnineteen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number (N): ");
        int N = s.nextInt();

        int sum = 0, a = 1;

        while (a <= N) {
            sum += a;
            a++;
        }

        System.out.println("Sum : " + sum);
        s.close();
	}
}