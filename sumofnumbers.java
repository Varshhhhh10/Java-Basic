import java.util.*;
public class sumofnumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        int sum=0;
    for(int i=1;i<=n;i++){
         sum=i+sum;
    }
    System.out.println(sum);
    }
}
