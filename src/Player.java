import java.util.ArrayList;
import java.util.List;
class Player {
    private String name;
    private int score;
    private List<String> achievements;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.achievements = new ArrayList<>();
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addAchievement(String achievement) {
        achievements.add(achievement);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Score: " + score + ", Achievements: " + achievements;
    }
}
