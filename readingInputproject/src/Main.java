import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int currentYear  = 2024;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch(NullPointerException e) {

            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("hi, what's your name?");
        System.out.println("hi "+ name + " thanks for reaching out ");
        String dateOfBirth = System.console().readLine("what's your birthyear?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println("so your age is " + age);
        return "";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

       // String name = System.console().readLine("hi, what's your name?");
        System.out.println("hi, whats your name?");
        String name = scanner.nextLine();
        System.out.println("hi "+ name + " thanks for reaching out ");
        // String dateOfBirth = System.console().readLine("what's your birthyear?");
        System.out.println(" what year were you born?");

        boolean validDOB = false;
        int age =0;

        do {
            System.out.println("enter a year of birth >= "+(currentYear - 125)+ "and <= " + (currentYear));
            try {
                age = dataCheck(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch( NumberFormatException BadUserData){
                System.out.println("Characters not allowed!! Try Again.");
            }
        } while(!validDOB);

        return ("you are " + age + " years old. " );

    }
    public static int dataCheck(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        // since 125 is the oldest human ever lived, we will assume the differential to be minimum
        if((dob < minimumYear)||(dob>currentYear)){
            return -1;
        }
        return (currentYear - dob);
    }
}
