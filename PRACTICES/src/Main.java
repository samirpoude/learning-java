import java.util.Scanner;
/* Write a Java program that takes a number as
input and prints its multiplication table up to 10.
 */
public class Main {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        /*String nextEntry = scanner.nextLine();
        int num = Integer.parseInt(nextEntry);*/
        for (int i = 1; i<=10;i++){
            int multiple = i * num;
            System.out.println(num+ " * " + i + " = " + multiple );
        }

    }
}
