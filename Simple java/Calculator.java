import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Calculator {
    public static void main(String[] args) {
        double result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 :");
        double num1=sc.nextDouble();
        System.out.println("Enter number 2 :");
        double num2= sc.nextDouble();
        System.out.println("Enter the operator");
        char op=sc.next().charAt(0);
        if(op=='+'){
            result=num1+num2;
            System.out.println(result);
        }
        if(op=='-'){
            result=num1-num2;
            System.out.println(result);
        }
        if(op=='*'){
            result=num1*num2;
            System.out.println(result);
        }
        if(op=='/') {
            if (num2 != 0) {
                result = num1 + num2;
                System.out.println(result);
            } else {
                System.out.println("Cannot divide by 0");
            }
        }
    }
}
