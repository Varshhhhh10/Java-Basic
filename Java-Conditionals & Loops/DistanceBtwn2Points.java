import java.util.Scanner;
//Calculate Distance Between Two Points
public class DistanceBtwn2Points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x and y coordinates of point 1 : ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.println("Enter the x and y coordinates of point 2 : ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The distance between the points are : "+distance);
    }
}
