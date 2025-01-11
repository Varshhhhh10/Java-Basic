import java.util.Scanner;
//Input currency in rupees and output in USD.
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount in INR");
        double inr=sc.nextDouble();
        double usd=inr*0.012;
        System.out.println(usd + " USD");
    }
}
