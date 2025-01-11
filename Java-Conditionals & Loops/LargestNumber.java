import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int max=0;
        while(true){
            n=sc.nextInt();
            if(n==0){
                break;
            }
            max=n;
        }
        System.out.println(max);
    }
}
