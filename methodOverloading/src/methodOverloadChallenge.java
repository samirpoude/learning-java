public class methodOverloadChallenge {
    public static void main(String[] args) {
        System.out.println("height in cm is = " + convertToCentimeters(65) + " centimeters.");
        System.out.println("height in cm is = " + convertToCentimeters(5,8 ) + " centimeters.");

    }
    public static double convertToCentimeters(int inches){
        return inches*2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters((feet*12)+inches);
    }
}
