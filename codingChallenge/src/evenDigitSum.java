public class evenDigitSum {
    // Write a method named getEvenDigitSum with one parameter of type int called number.
//
//The method should return the sum of the even digits within the number.
//
//If the number is negative, the method should return -1 to indicate an invalid value.
    public static void main(String[] args) {
        System.out.println("total sum of even numbers within the given number is: " + getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if (number <0){
            return -1;
        }
        // check if number is negative
        int sum = 0;
        while(number!=0) {
            int num = number % 10;
            // taking the last number of the given number using modulus,
            // and check if it is even.
            if (num % 2 == 0) {
                sum += num;
                // if even add to sum.
            }
            number /= 10;
            // we remove the last digit and check remaining digit using while loop.
            // its same as number = number/10.
        }
        return sum;
    }

}
