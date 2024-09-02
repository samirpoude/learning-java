import java.util.Scanner;
public class challengeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        // double sum = 0;

        while (count <= 5) {
            System.out.println("enter the number #" + count);
            String num = scanner.nextLine();
            try {
                int number = Integer.parseInt(num);
                // double number = Double.parseDouble(num);
                count++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("invalid number!!");

            }

        }
        System.out.println("the sum of entered number = " + sum);


    }


}



