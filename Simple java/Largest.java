import java.util.Scanner;
//Take 2 numbers as input and print the largest number.
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }

    }
}
