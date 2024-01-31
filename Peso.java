import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {

        int amt, r500 = 0, r100 = 0, r20 = 0, r10 = 0, r5 = 0, r2 = 0, r1 = 0, count=0;
        System.out.print("Enter the amount in pesos: \n\n");
        Scanner skill = new Scanner(System.in);
        amt = skill.nextInt();

        while (amt >= 500) {
            r500 = amt / 500;
            amt = amt % 500;
            System.out.print("\nTotal number of 500 peso notes: " + r500);
        }

        while (amt >= 100) {
            r100 = amt / 100;
            amt = amt % 100;
            System.out.print("\nTotal number of 100 peso notes: " + r100);
        }

        while (amt >= 20) {
            r20 = amt / 20;
            amt = amt % 20;
            System.out.print("\nTotal number of 20 peso notes: " + r20);
        }

        while (amt >= 10) {
            r10 = amt / 10;
            amt = amt % 10;
            System.out.print("\nTotal number of 10 peso notes: " + r10);
        }

        while (amt >= 5) {
            r5 = amt / 5;
            amt = amt % 5;
            System.out.print("\nTotal number of 5 peso notes: " + r5);
        }

        while (amt >= 2) {
            r2 = amt / 2;
            amt = amt % 2;
            System.out.print("\nTotal number of 2 peso coins: " + r2);
        }

        while (amt >= 1) {
            r1 = amt / 1;
            amt = amt % 1;
            System.out.print("\nTotal number of 1 peso coins: " + r1);
        }

        count = r500 + r100 + r20 + r10 + r5 + r2 + r1;
        skill.close();
    }
}
