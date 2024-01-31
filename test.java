    import java.util.Scanner;
    public class test {

        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
    double q1,q2,q3,q4,q5,ave;

    System.out.print("Enter Score of Quiz 1 : ");
    q1=scan.nextDouble();
    System.out.print("Enter Score of Quiz 2 :  ");
    q2=scan.nextDouble();
    System.out.print("Enter Score of Quiz 3 :  ");
    q3=scan.nextDouble();
    System.out.print("Enter Score of Quiz 4 : ");
    q4=scan.nextDouble();
    System.out.print("Enter Score of Quiz 5 : ");
    q5=scan.nextDouble();

    ave=(q1+q2+q3+q4+q5)/5;
    System.out.println("Average is "+ave);
    scan.close();

        }
    }
