
// • Create a for loop using a range of numbers from 1 to 1000 inclusive.
//• Sum all the numbers that can be divided by both 3 and 5.
//• Print out the numbers that have met the above conditions.
//• Break out of the loop once you have found 5 numbers that met the conditions above.
//• After breaking out of the loop, print the sum of the numbers that met the conditions above.
//• Note: type all code in the main method.

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int count =0;
        int sum = 0;
        for (int i = 1; count<=5 && i<=1000; i++){
            if ((i%3 == 0) && (i%5 ==0) ){
                System.out.println(i + " has met the condition.");
                i++; // i is incremented //
                count ++;
                sum +=i; // adding the numbers who meet the condition //

            }
        }
        System.out.println("the sum of numbers are " + sum);


    }
}
