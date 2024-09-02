public class DecimalComparator {
    public static void main(String[] args) {
        boolean p = areEqualByThreeDecimalPlaces(-9.17561237868976,-3.17523);
        System.out.println(p);
        System.out.println("hi name is samir poudel");


    }
    public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        int scaledNum1 = (int) (a * 1000)% 1000;
        int scaledNum2 = (int) (b * 1000)%1000;

        return scaledNum1 == scaledNum2;




    }
}
