import java.util.Scanner;
/*Write a Java program that accepts four integers from the user and
 prints equal if all four are equal, and not equal otherwise.*/


public class equal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = in.nextInt();
        System.out.print("enter second number: ");
        int b = in.nextInt();
        System.out.print("enter third number: ");
        int c = in.nextInt();
        System.out.print("enter fourth number: ");
        int d = in.nextInt();

        if (a==b && b==c && c==d){
            System.out.print("numbers are equal.");
        }else{
            System.out.println("number are not equal.");
        }
    }
}
