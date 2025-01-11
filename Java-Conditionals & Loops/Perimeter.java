import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Perimeter Of Circle
        System.out.println("Enter the radius");
        double r=sc.nextDouble();
        double circle_perimeter=3.14*r*2;
        System.out.println("Perimeter of the circle is " +circle_perimeter);

        //Perimeter Of Equilateral Triangle
        System.out.println("Enter the side of the equvilateral triangle");
        double side=sc.nextDouble();
        double equvi_perimeter= 3*side;
        System.out.println("Perimeter of the triangle is " +equvi_perimeter);

        //Perimeter Of Parallelogram - is same as rectangle
        System.out.println("Enter base and height of the parallelogram");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double parallelogram_perimeter=2*(base+height);
        System.out.println("Perimeter of the parallelogram is " +parallelogram_perimeter);

        //Perimeter Of Rectangle
        System.out.println("Enter base and height of the rectangle");
        double base1=sc.nextDouble();
        double height1=sc.nextDouble();
        double rectangle_perimeter=2*(base+height);
        System.out.println("Perimeter of the parallelogram is " +rectangle_perimeter);

        //Perimeter Of Square
        System.out.println("Enter the side of the square");
        double sqside=sc.nextDouble();
        double sq_perimeter= 4*side;
        System.out.println("Perimeter of the square is " +sq_perimeter);

        //Perimeter Of Rhombus - is same as square
        System.out.println("Enter the side of the square");
        double rhside=sc.nextDouble();
        double rh_perimeter= 4*side;
        System.out.println("Perimeter of the rhombus is " +rh_perimeter);

    }
}
