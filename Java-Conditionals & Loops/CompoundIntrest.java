import java.util.Scanner;
//Compound Interest Java Program
public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount");
        double p= sc.nextDouble();
        System.out.println("Enter the annual intrest rate in decimal");
        double r= sc.nextDouble();
        System.out.println("Enter the number of times interest is compounded per year");
        double n= sc.nextDouble();
        System.out.println("Enter the time in years");
        double t= sc.nextDouble();
        double a=p*Math.pow((1+r/n),n*t);
        double ci=a-p;
        System.out.println(ci);


    }

}
