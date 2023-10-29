class StatisticsDisplay implements ScoreboardObserver, ScoreboardDisplay {
    @Override
    public void update(Player player) {
        // Display player statistics (e.g., total score, achievements)
        System.out.println("Player Statistics: " + player);
    }
}