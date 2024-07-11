//drawing half pyramid rotated at 180 deg.    
/*          *
           **   this problem in each row fr eq. for n=4, 1st row it has 3 (4-1=3) spaces and 1 star,second row, 
           2 (4-2=2) spaces and 2 stars spaces are n-i and stars are like prev qs */

import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ //outer loop
            for(int j=1;j<=n-i;j++){ // has 2 inner loops this is for space printing
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ // this is for star printing
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
