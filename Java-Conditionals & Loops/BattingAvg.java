import java.util.Scanner;
//Calculate Batting Average
public class BattingAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int runs_total=0;
        System.out.println("Enter the number of innings");
        int innings=sc.nextInt();
        System.out.println("Enter runs in each innings");
        for (int i = 1; i <=innings ; i++) {
            int runs=sc.nextInt();
            runs_total+=runs;
        }
        System.out.println("Enter the number of times the player was out");
        int out=sc.nextInt();
        int batting_Avg=runs_total/out;
        System.out.println(batting_Avg);

    }
}
