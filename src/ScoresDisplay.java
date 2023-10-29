class ScoresDisplay implements ScoreboardObserver, ScoreboardDisplay {
    @Override
    public void update(Player player) {
        // Display player scores
        System.out.println("Player Scores: " + player.getName() + " - " + player.getScore());
    }
}