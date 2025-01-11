import java.util.Scanner;
//Take name as input and print a greeting message for that particular name.
public class Greeting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.next();
        System.out.println("Hi "+ name+"! have a nice day :)");
    }
}
