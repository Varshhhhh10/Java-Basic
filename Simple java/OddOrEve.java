import java.util.Scanner;
// Write a program to print whether a number is even or odd, also take input from the user.
public class OddOrEve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        if(num==0){
            System.out.println("The number is neither even nor odd");
        }
        if(num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
