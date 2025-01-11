import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount ");
        double p=sc.nextDouble();
        System.out.println("Enter the time"); // in years
        double t=sc.nextDouble();
        System.out.println("Enter the rate of intrest");//in percentage
        double r=sc.nextDouble();
        double SI= p*t*r/100;
        System.out.println(SI);
    }
}
