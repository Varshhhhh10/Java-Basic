//printing half pyramid numbers instead of stars
import java.util.Scanner;
class pattern6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
        System.out.println();
        }



    }
}

/*  enter the rows
4
1   
12  
123 
1234 */