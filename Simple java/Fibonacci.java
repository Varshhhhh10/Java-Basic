import java.util.Scanner;
//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=0;
        int a=0,b=1;
        System.out.println("Enter nth number for the series");
        int n=sc.nextInt();
        if(n==1){
            System.out.println(a);
        }
        if(n==2) {
            System.out.println(b);
        }
        for(int i=3;i<=n;i++){
            result=a+b;
            a=b;
            b=result;
        }
        System.out.println(result);
    }
}
