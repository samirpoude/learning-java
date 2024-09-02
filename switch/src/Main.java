
public class Main {
    public static void main(String[] args) {
        int switchValue = 7;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 3");
            case 3, 4, 5 -> {
                System.out.println("was 3,4,5");
                System.out.println("actually it was = " + switchValue);
            }
            default -> {
                System.out.println("was not 1,2,3,4 or 5");
                System.out.println("it was = " + switchValue);
            }

        }
        String month = "october";
        System.out.println(month + " is in the  "+ getQuarter(month)+ " quarter ");
    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "january", "february", "march" -> "1st";
            case "april", "may", "june" -> "2nd";
            case "july", "august", "september" -> "3rd";
            case "october", "november", "december" -> "4th";
            default -> "bad";
        };
    }
}
