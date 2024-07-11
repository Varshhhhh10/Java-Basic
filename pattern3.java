// printing half pyramid...
// here first row has 1 star second has 2 stars and third has 3 and so on..

import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){//normal for loop
            for(int j=1;j<=i;j++){ //for printing stars in corresponding rows
                System.out.print("*");
            }
            System.out.println(); //going to next line

        }
    }
    
}
