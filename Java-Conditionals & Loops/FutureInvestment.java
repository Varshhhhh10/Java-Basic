import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter present value (initial investment");
        double pv= sc.nextDouble();
        System.out.println("Enter annual intrest rate");
        double r= sc.nextDouble();
        System.out.println("Enter the number of years");
        int n= sc.nextInt();
        double fv=pv*Math.pow(1+r,n);
        System.out.println(fv);

    }
}
