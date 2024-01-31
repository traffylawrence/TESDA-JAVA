import java.util.*;
public class largernum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter First Number: ");
        num1=scan.nextInt();
     System.out.print("Enter Second Number: ");
        num2=scan.nextInt();
if (num1>num2) {
    System.out.println("Number "+num1+" Larger than Number "+num2);
}
else if (num2>num1){
 System.out.println("Number "+num2+" is Larger than Number "+num1);
}
else{
    System.out.println("Number is equal");
}
           scan.close();
    }
}
