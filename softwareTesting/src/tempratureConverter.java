public class tempratureConverter {
    public static void main(String[] args){
        System.out.print(celsiusToFarenheit(25) + "    ");
        System.out.print(farenheitToCelsius(77));


    }

    public static double celsiusToFarenheit( double c){
        return (c * 9/5)+32;
    }
    public static double farenheitToCelsius( double f){
        return (f -32)* 5/9;

    }


}
