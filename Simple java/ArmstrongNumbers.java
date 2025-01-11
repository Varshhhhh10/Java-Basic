import java.util.Scanner;
//To find Armstrong Number between two given number.
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;
        int digits = 0;

        // Find the number of digits
        while (num != 0) {
            num = num / 10;
            digits++;
        }

        num = originalNum; // Restore the original number

        // Check if the number is an Armstrong number
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        // If sum equals the original number, it's an Armstrong number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
