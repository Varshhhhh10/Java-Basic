import java.util.Scanner;
//Calculate Discount Of Product
public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the original price");
        double original=sc.nextDouble();
        System.out.println("Enter the discount");
        double discount= sc.nextDouble();
        double discountPercent=(original*discount)/100;
        double discountedPrice=original-discountPercent;
        System.out.println("The price after discount is " +discountedPrice);

    }
}
