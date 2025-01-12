import java.util.Scanner;
//Calculate Average Of N Numbers
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int avg=0;
        System.out.println("Enter total numbers to find its average");
        int n=sc.nextInt();
        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            double nums= sc.nextDouble();
            sum+=nums;

        }
        avg=sum/n;
        System.out.println(avg);
    }
}
