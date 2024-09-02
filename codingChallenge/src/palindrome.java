public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));

    }
    public static boolean isPalindrome(int number){
        // check for negative number //
        if ((number<0)||(number ==0)){
            return false;
        }
        if (number !=0 && number % 10 ==0){
            return false;
        }
        int reverse = 0 ;
        int original = number;
        while(original !=0){
            reverse = reverse  *10 + original % 10;
            original /=10;

        }
        return reverse == number;

    }
}
