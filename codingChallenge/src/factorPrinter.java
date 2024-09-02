public class factorPrinter {
    public static void main(String[] args) {
        printFactors(-1);
    }
    public static void printFactors( int num){
        if (num<1) {
            System.out.println("Invalid Value");
            return;
        }
        int i = 1;
        while(i<=num){
            if (num%i == 0){
                System.out.println(i);
            }
            i++;
        }
        /* we can also use for loop to solve this question.
          for (i = 1; i<=num;i++){
            if(num%i ==0 ){
               System.out.println(i);
           }
          }
         */

    }
}
