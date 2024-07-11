//floyd pattern
import java.util.Scanner;
public class floyd_pattern {
    public static void main(String[] args) {
        int number=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" "); //printing the number
                number++; //incrementing to the next number
            }
            System.out.println();
        }
    }
    
}
/* 1 
2 3
4 5 6 
7 8 9 10
11 12 13 14 15 */
