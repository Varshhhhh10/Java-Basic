import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n=sc.nextInt();
        System.out.println("enter the number of columns: ");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n ||j==m ){ //stars are present at first row,col and last row,col
                    System.out.print("*"); //printing *

                }else{
                    System.out.print(" "); //gives space in between
                }
            }
            System.out.println(); //next line
        }
    }
}
            
    
