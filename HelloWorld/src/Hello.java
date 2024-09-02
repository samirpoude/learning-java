public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, samir");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not alien");
        }
        else
            System.out.println("it is alien");

        int topScore = 80;
        if (topScore <= 100){
            System.out.println("you got the highest score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <=90)){
            System.out.println("either or both the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("this is true");

        }
        boolean isCar = false;
        if (!isCar){
            System.out.println("this is not supposed to happen");
        }
        String makeOfCar = "volkswagen";
        boolean isDomestic = makeOfCar == "volkswagen" ? false : true;
        if (isDomestic){
            System.out.println("this car is domestic");
        }

        String s = (isDomestic) ? "this car is domestic" : "this is not domestic";

        System.out.println(s);

        double firstNum = 20.00d;
        double secondNum = 80.00d;
        double thirdNum = (firstNum + secondNum ) * 100.00d;
        double remain = thirdNum % 40.00d;
        System.out.println(remain);
        boolean val = (remain == 0) ? true: false;
        System.out.println(val);
        if (!val) {
            System.out.println("got some remainder");
        }
    }
}
