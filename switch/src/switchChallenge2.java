// Write a method called printNumberInWord. The method has one parameter number which is the whole number.
// The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
// You can use if-else statement or switch statement whatever is easier for you.

public class switchChallenge2 {
    public static void main(String[] args) {
        printNumberInWord(100);
    }
        public static void printNumberInWord(int number){

            String numberInWord = switch(number){
                case 0 -> "ZERO";
                case 1 -> "ONE";
                case 2 -> "TWO";
                case 3 -> "THREE";
                case 4 -> "FOUR";
                case 5 -> "FIVE";
                case 6 -> "SIX";
                case 7 -> "SEVEN";
                case 8 -> "EIGHT";
                case 9 -> "NINE";
                default -> "OTHER";

            };
            System.out.println(numberInWord);
        }
    }

