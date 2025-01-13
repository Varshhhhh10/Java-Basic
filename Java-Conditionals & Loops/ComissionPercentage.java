import java.util.Scanner;
//Calculate Commission Percentage
public class ComissionPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your comission amount");
        double amt=sc.nextDouble();
        System.out.println("Enter the total sales amount");
        double sales=sc.nextDouble();
        double com_percent=(amt/sales)*100;
        System.out.println("Your comission percentage is: "+com_percent+"%");
    }
}
