
public class Main {
    public static void main(String[] args) {
        GameScoreboard scoreboard = new GameScoreboard();

        ScoreboardDisplay statisticsDisplay = ScoreboardDisplayFactory.createDisplay("statistics");
        ScoreboardDisplay scoresDisplay = ScoreboardDisplayFactory.createDisplay("scores");

        scoreboard.addObserver((ScoreboardObserver) statisticsDisplay);
        scoreboard.addObserver((ScoreboardObserver) scoresDisplay);

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        scoreboard.addPlayer(player1);
        scoreboard.addPlayer(player2);

        // Simulate game updates
        scoreboard.updateScore(player1, 100);
        scoreboard.updateAchievements(player2, "High Score");
    }
}