
public class MethodChallenge {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("samir", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("sital", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("bob", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("marley", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("percy", position);


    }
    public static void displayHighScorePosition(String name, int position){

        System.out.println( name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }else if (score >= 500 ){
            return 2;
        }else if (score >= 100){
            return 3;
        }
        return 4;
    }



}

