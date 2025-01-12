import java.util.Scanner;
//Factorial Program In Java
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("Enter a number to find its factorial");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Factorial cannot be found :( ");
        }
        if(n==1 || n==0){
            System.out.println(n);
        }
        for (int i = 1; i <=n ; i++) {
            fact=fact*i;

        }
        System.out.println(fact);
    }

}
