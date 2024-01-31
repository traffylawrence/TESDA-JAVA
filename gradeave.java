import java.util.Scanner;
public class gradeave {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        double ave,eng,math,scie,com;
        
System.out.print("Enter Grade for English: ");
eng=scan.nextDouble();
System.out.print("Enter Grade for Math: ");
math=scan.nextDouble();
System.out.print("Enter Grade for Science: ");
scie=scan.nextDouble();
System.out.print("Enter Grade for Computer: ");
com=scan.nextDouble();
ave=(eng+math+scie+com)/4;


System.out.println("*****************************");
System.out.println("Average is : "+ave);

if(ave>100){
    System.out.println("Invalid Grade");
}
else if(ave>=98){
    System.out.println("With Highest Honors");
}
else if(ave>=95){
    System.out.println("With High Honors");
}
else if(ave>=90){
    System.out.println("With Honors");
}
else if(ave>=75){
    System.out.println("Passed");
}
else{
    System.out.println("Failed");
}
System.out.println("*****************************");
scan.close();
}
}
