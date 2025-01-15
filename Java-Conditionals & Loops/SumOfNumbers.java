import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the numbers");
        while(true){

            int num=sc.nextInt();
            if(num<0){
                break;
            }
            sum+=num;
        }
        System.out.println("sum: "+sum);

    }
}
