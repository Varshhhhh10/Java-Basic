import java.util.*;
public class calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1: ");
        int n1=sc.nextInt();
        System.out.println("enter operator: ");
        char op=sc.next().charAt(0);
        System.out.println("enter number 2: ");
        int n2=sc.nextInt();
        switch(op){
            case '+': System.out.println(n1+n2);
            break;
            case '-': System.out.println(n1-n2);
            break;
            case '*': System.out.println(n1*n2);
            break;
            case '/': System.out.println(n1/n2);
            break;

        }


    }

    
}
