import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Area Of Circle Java Program
        System.out.println("Enter the radius");
        double r=sc.nextDouble();
        double circle_area=3.14*r*r;
        System.out.println("Area of the circle is " +circle_area);

        //Area Of Triangle
        System.out.println("Enter base and height of the triangle");
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        double triangle_area=0.5*b*h;
        System.out.println("Area of the triangle is " +triangle_area);

        //Area Of Rectangle Program
        System.out.println("Enter length and breadth of the rectangle");
        double l=sc.nextDouble();
        double breadth=sc.nextDouble();
        double rectangle_area=breadth*l;
        System.out.println("Area of the triangle is " +rectangle_area);

        //Area Of Isosceles Triangle - is same as triangle
        System.out.println("Enter base and height of the triangle");
        double b1=sc.nextDouble();
        double h1=sc.nextDouble();
        double Isotriangle_area=0.5*b1*h1;
        System.out.println("Area of the triangle is " +Isotriangle_area);

        //Area Of parallelogram - is same as rectangle
        System.out.println("Enter base and height of the parallelogram");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double parallelogram_area=base*height;
        System.out.println("Area of the parallelogram is " +rectangle_area);

        //Area Of Rhombus
        System.out.println("Enter length of the two diagonals of the rhombus");
        double d1=sc.nextDouble();
        double d2=sc.nextDouble();
        double rhombus_area=d1*d2;
        System.out.println("Area of the Rhombus is " +rhombus_area);

        //Area Of Equilateral Triangle
        System.out.println("Enter the side of the equvilateral triangle");
        double side=sc.nextDouble();
        double equtriangle_area= (Math.sqrt(3)/4)*side*side;
        System.out.println("Area of the triangle is " +equtriangle_area);

    }
}
