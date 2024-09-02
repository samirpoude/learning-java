public class LeapYear {
    public static void main(String[] args) {
        boolean Leap = isLeapYear(10000);
        System.out.println(Leap);
    }

    public static boolean isLeapYear(int year){
        if(year>=1 && year <=9999){
            if(year%4 == 0 && year % 100 == 0 && year % 400 == 0){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
