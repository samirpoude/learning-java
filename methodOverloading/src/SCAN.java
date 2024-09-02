import java.util.Scanner;
public class SCAN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is you name?");
        String name = scan.next();
        System.out.println("what is your age?");
        int age = scan.nextInt();
        if (age >= 18){
            System.out.println("welcome " + name + " you can buy alcohol as your are " +age+ " years old.");
        }else {
            System.out.println("sorry " + name + ", you cant buy alcohol as you are " + age + " years old.");
        }
    }
}
