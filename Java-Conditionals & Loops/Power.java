import java.util.Scanner;
//Power In Java
public class Power {
    public static void main(String[] args) {
        int ans=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find its power");
        int num=sc.nextInt();
        System.out.println("Enter the power");
        int pow=sc.nextInt();
        for (int i = 1; i <=pow ; i++) {
            ans*=num;
        }
        System.out.println(ans);
    }
}
