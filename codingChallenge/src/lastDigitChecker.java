public class lastDigitChecker {
    //Write a method named hasSameLastDigit with three parameters of type int.
    //Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
    // If one of the numbers is not within the range, the method should return false.
    //The method should return true if at least two of the numbers share the same rightmost digit;
    // otherwise, it should return false.
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(25,22,45));
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
        // this method checks validity according to question.

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            //method overloading is seen here.
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
    }
}

