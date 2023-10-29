import java.util.ArrayList;
import java.util.List;
class GameScoreboard {
    private List<ScoreboardObserver> observers = new ArrayList<>();
    private List<Player> players = new ArrayList<>();

    public void addObserver(ScoreboardObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ScoreboardObserver observer) {
        observers.remove(observer);
    }

    public void addPlayer(Player player) {
        players.add(player);
        notifyObservers(player);
    }

    public void updateScore(Player player, int newScore) {
        player.setScore(newScore);
        notifyObservers(player);
    }

    public void updateAchievements(Player player, String achievement) {
        player.addAchievement(achievement);
        notifyObservers(player);
    }

    private void notifyObservers(Player player) {
        for (ScoreboardObserver observer : observers) {
            observer.update(player);
        }
    }
}