class ScoreboardDisplayFactory {
    public static ScoreboardDisplay createDisplay(String displayType) {
        if (displayType.equalsIgnoreCase("statistics")) {
            return new StatisticsDisplay();
        } else if (displayType.equalsIgnoreCase("scores")) {
            return new ScoresDisplay();
        } else {
            return null; // Handle unsupported display types
        }
    }
}