import java.util.Scanner;
public class Hcf {


    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate HCF using an iterative approach
            int hcf = findHCF(num1, num2);

            // Output the result
            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

            scanner.close();
        }

        // Iterative method to calculate HCF
        public static int findHCF(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }


