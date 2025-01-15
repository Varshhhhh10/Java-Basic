import java.util.Scanner;
//Calculate Average Marks
public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of subjects");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("Enter  the marks of subject "+i);
            double marks= sc.nextDouble();
            sum+=marks;

        }
        double avg=sum/n;
        System.out.println(avg);

    }
}
