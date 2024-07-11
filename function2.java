import java.util.Scanner;
public class function2 {
    public static int printOdd (int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
         
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n=sc.nextInt();
        
        int sum= printOdd(n);
        System.out.println("the sum of "+ n + " numbers are :" +sum);
        
    
}
}