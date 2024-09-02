public class sharedDigit {
    // Write a method named hasSharedDigit with two parameters of type int.
    //Each number should be within the range of 10 (inclusive) - 99 (inclusive).
    // If one of the numbers is not within the range, the method should return false.
    //The method should return true if there is a digit that appears in both numbers,
    // such as 2 in 12 and 23; otherwise, the method should return false.
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(46,65));

    }
    public static boolean hasSharedDigit(int first, int second) {

        boolean firstValid = first > 9 && first < 100;
        boolean secondValid = second > 9 && second < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

        int firstLeftDigit = first / 10;
        int firstRightDigit = first % 10;
        int secondLeftDigit = second / 10;
        int secondRightDigit = second % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }
}
