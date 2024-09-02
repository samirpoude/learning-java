public class firsLastDigitSum {

    // The method needs to find the first and the last digit of the parameter number
    // passed to the method,
    // using a loop and return the sum of the first and the last digit of that number.
    public static void main(String[] args) {
        System.out.println(sumFirstLast(-89874));

    }
    public static int sumFirstLast(int number){
        if (number < 0 ){
            return -1;
        }

        int lastDigit = number%10;
        // use % 10 to get last digit in a number.
        int firstDigit = 0;
        while (number>=10){
            firstDigit= (number/=10);
            // / divide with 10 until there is 1 digit left (< 10) to get first digit.
            // This is also equivalent to number = number / 10.
        }
        return lastDigit + firstDigit;
    }

}
