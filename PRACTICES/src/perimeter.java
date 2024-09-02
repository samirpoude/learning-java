import java.util.Scanner;
import java.lang.Math;
/* Write a Java program to print the area and perimeter of a circle.
 */

/*public class perimeter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        String radius = scanner.nextLine();
        double rad = Double.parseDouble(radius);
        double area = Math.PI * rad * rad;
        double perimeter = 2 * Math.PI * rad;
        System.out.print("area is: "+ area );
        System.out.print("  perimeter is: "+perimeter);

    }
} */

public class perimeter {
    public static double area(double r) {
        return Math.PI * r * r;
    }
    public static double perimeterr(double r){
        return Math.PI*r*2;
    }

    public static void main(String[] args){
        int r = 5;
        System.out.print(" area is: " + area(r) + "   perimeter is: " + perimeterr(r));
    }
}