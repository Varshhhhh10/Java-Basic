import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units consumed");
        double units= sc.nextDouble();
        System.out.println("Enter the Rate per unit");
        double rpu=sc.nextDouble();
        System.out.println("Enter fixed rate");
        double fixed=sc.nextDouble();
        double bill=units*rpu+fixed;
        System.out.println("Your bill is "+ bill);

    }
}
