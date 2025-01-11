import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 and number 2 for addition");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sum=n1+n2;
        System.out.println(sum);
    }
}
