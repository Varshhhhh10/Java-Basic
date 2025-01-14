import java.util.Scanner;
//Calculate Depreciation of Value
public class Depreciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of the asset");
        double asset=sc.nextDouble();
        System.out.println("Enter the Salvage value");
        double  salvage=sc.nextDouble();
        System.out.println("Enter the useful life of the asset");
        double useful=sc.nextDouble();
        double dep_value= (asset-salvage)/useful;
        System.out.println("The depreciation value is " +dep_value);
    }
}
//Cost of Asset: Initial purchase price of the asset.
//Salvage Value: Estimated value of the asset at the end of its useful life.
//Useful Life: Estimated number of years the asset will be used.