import java.util.Scanner;

public class PaliNumbers {
    public static void main(String[] args) {
        int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int originalNum=num;
        while (num != 0) {
            int digit = num % 10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(originalNum==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
