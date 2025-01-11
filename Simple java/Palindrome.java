import java.util.Scanner;
//To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word");
        String word= sc.next();
        boolean isPali=true;
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                isPali=false;
                break;
            }
        }
        if (isPali) System.out.println("Its Palindrome");
        else System.out.println("Not Palindrome");
    }
}
