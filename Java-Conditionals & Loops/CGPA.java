import java.util.Scanner;
//Calculate CGPA Java Program
public class CGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        System.out.println("Enter the number of subjects");
        int subs=sc.nextInt();
        System.out.println("Enter the grade in each subjects");
        for (int i = 1; i <=subs ; i++) {
            int grade=sc.nextInt();
            sum+=grade;
        }
        double cgpa=sum/subs;
        System.out.println(cgpa);
    }
}
