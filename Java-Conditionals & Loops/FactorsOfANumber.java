import java.util.Scanner;
//Input a number and print all the factors of that number (use loops).
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its factors");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
