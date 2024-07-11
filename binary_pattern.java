// binary half pyramid problem here in cell (1,1 whose sum is 2) 1 is present similarly in (2,1 sum=3 is odd) 0 i present

import java.util.Scanner;
public class binary_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        } 
        
    }
    
}
