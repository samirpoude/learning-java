import java.util.Scanner;

public class minMaxChallenge {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true){
            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();

            try{
                double validNum = Double.parseDouble(nextEntry);
                if(loopCount == 0 || validNum <min){
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max){
                    max = validNum;
                }
                loopCount ++;
            } catch(NumberFormatException nfe){
                break;
            }

        }
        if (loopCount > 0 ){
            System.out.println("min number is: " + min + " maximum number is: " + max);
        } else{
            System.out.println("no valid data is entered");
        }
    }
}
