import java.util.Scanner;
public class function1 {
    public static float printAverage (float a, float b, float c){
        float avg=(a+b+c)/3;
        return avg;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        float a=sc.nextFloat();
        System.out.println("enter number 2" );
        float b=sc.nextFloat();
        System.out.println("enter number 3");
        float c=sc.nextFloat();
        float avg= printAverage( a, b, c);
        System.out.println("the average of three numbers are :" +avg);
        
    
}
}
