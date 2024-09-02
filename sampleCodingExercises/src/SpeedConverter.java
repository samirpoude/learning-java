public class SpeedConverter {
    public static void main(String[] args){
        printConversion(89);

    }

    public static double toMilesPerhour(double  kilometersPerHour){
        if (kilometersPerHour>0){
            return Math.round(kilometersPerHour / 1.609) ;
        }else{
            return -1;
        }
    }
    public static void printConversion(double kilometersPerHour){

        double  YY =  toMilesPerhour(kilometersPerHour);
        System.out.println(YY);

        if (kilometersPerHour > 0 ){
            System.out.println( kilometersPerHour +  " km/h = " + YY + " mi/h");
        } else{
            System.out.println("invalid value!");
        }



    }

}
