import java.util.Scanner;
public class comparisons {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter value of number 1: ");
        int num1=sc.nextInt();
        System.out.println("enter value of number 2: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("number 1 is greater than number 2");
        }
        else if(num1<num2){
            System.out.println("number 1 is lesser than number 2");
        }else{
            System.out.println("numbers are equal");
        }
    }
}
