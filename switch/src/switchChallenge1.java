public class switchChallenge1 {
    public static void main(String[] args) {
        printDayOfWeek(5);


        printWeekDay(4);

    }
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch(day){
            case 0 -> {yield "sunday";}
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> "invalid day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    // same challenge with if-else statement //
    public static void printWeekDay(int day){
        String dayOfWeek = "invalid day";
        if (day == 0){
            dayOfWeek = "sunday";
        } else if (day == 1){
            dayOfWeek = "monday";
        } else if (day == 2){
            dayOfWeek = "tuesday";
        } else if (day == 3){
            dayOfWeek = "wednesday";
        } else if (day == 4){
            dayOfWeek = "thursday";
        } else if (day == 5){
            dayOfWeek = "friday";
        } else if (day == 6){
            dayOfWeek = "saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
