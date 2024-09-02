public class whileLoopChallenge {
    public static void main(String[] args) {
        int num = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        while (num<= finishNumber && evenCount <5 ){
            num++;

            /*
             checking the even numbers between 5 and 20 and recording the odd
             and even numbers
            */
            if (!isEvenNumber(num)){
                oddCount++;
                continue;
            }
            evenCount++;
            System.out.println("even number = " + num);
        }
        System.out.println("total number of even numbers are = " + evenCount);
        System.out.println("total number of odd numbers are = " + oddCount);


    }



    public static boolean isEvenNumber(int num){
        if(num%2 == 0){
            return true;
        }
        return false;
    }


}
