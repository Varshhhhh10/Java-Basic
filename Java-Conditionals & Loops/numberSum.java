import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class numberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        while (true) {
            n=sc.nextInt();
            if(n==0){
                break;
            }
            sum=sum+n;
        }

        System.out.println(sum);
    }
}
