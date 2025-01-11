import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Volume Of Cone Java Program
        System.out.println("Enter the radius and height of cone");
        double r= sc.nextDouble();
        double h= sc.nextDouble();
        double vol_cone=(1/3)*3.14*r*r*h;
        System.out.println("The volume of cone is "+vol_cone);

        //Volume Of Prism
        System.out.println("Enter the base area and height of prism");
        double ba= sc.nextDouble();
        double h1= sc.nextDouble();
        double vol_prism=ba*h1;
        System.out.println("The volume of cone is "+vol_prism);

        //Volume Of Cylinder
        System.out.println("Enter the radius and height of cylinder");
        double r1= sc.nextDouble();
        double h2= sc.nextDouble();
        double vol_cyl=r1*h2;
        System.out.println("The volume of cone is "+vol_cyl);

        //Volume Of Sphere
        System.out.println("Enter the radius of sphere");
        double radius= sc.nextDouble();
        double vol_sphere=(4/3)*3.14*radius*radius*radius;
        System.out.println("The volume of cone is "+vol_sphere);

        //Volume Of Pyramid
        System.out.println("Enter the base area and height of pyramid");
        double ba1= sc.nextDouble();
        double h3= sc.nextDouble();
        double vol_pyramid=ba1*h3;
        System.out.println("The volume of cone is "+vol_prism);

        //Curved Surface Area Of Cylinder
        System.out.println("Enter the radius and height of cylinder");
        double r2= sc.nextDouble();
        double h4= sc.nextDouble();
        double csa=2*3.14*h4;
        System.out.println("The CSA of cone is "+csa);

        //Total Surface Area Of Cube
        System.out.println("Enter the side of the cube");
        double sqside=sc.nextDouble();
        double tsa= 6*sqside*sqside;
        System.out.println("Perimeter of the square is " +sqside);

    }

}
