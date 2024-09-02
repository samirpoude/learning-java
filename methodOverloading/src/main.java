public class main {
    public static void main(String[] args) {
        int newScore = calculateScore("samir", 1000);
        System.out.println("new Score is " + newScore);
        calculateScore(89);
        calculateScore();

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + " scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore( int score){
        System.out.println("unnamed player " + " scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("no player name , no player score");
        return 0;
    }

}
