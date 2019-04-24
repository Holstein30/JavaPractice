public class Main {

    public static void main(String[] args) {

        HighScore.newScores();
        
        int highScorePosition = HighScore.calculateHighScorePosition(1500);
        HighScore.displayHighScorePosition("John", highScorePosition);

        highScorePosition = HighScore.calculateHighScorePosition(800);
        HighScore.displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = HighScore.calculateHighScorePosition(100);
        HighScore.displayHighScorePosition("Jeff", highScorePosition);

        highScorePosition = HighScore.calculateHighScorePosition(50);
        HighScore.displayHighScorePosition("James", highScorePosition);

        highScorePosition = HighScore.calculateHighScorePosition(1000);
        HighScore.displayHighScorePosition("Jacob", highScorePosition);


    }
}
