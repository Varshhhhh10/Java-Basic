//Apna college DSA prep playlist
// Creating a rectangle of * with n rows and m cols (inner loop is for columns,outer for rows)

import java.util.Scanner;
class pattern1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n=sc.nextInt();
        System.out.println("enter the number of columns: ");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*"); //prints in a single row in which each element is a column
            }
           System.out.println(); //prints in next line
           

        }
    }

}