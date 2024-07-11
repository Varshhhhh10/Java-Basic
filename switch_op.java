import java.util.*;
public class switch_op {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        switch(a){
            case 1: System.err.println("hello");
            break;
            case 2: System.out.println("Namaskara");
            break;
            case 3: System.out.println("bonjour");
            break;
            default:System.out.println("invalid");
        }


    }
   
}
