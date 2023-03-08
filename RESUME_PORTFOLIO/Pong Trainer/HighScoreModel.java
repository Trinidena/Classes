public class HighScoreModel {
    private int score;
    private int bestScore;
    private StringBuilder attempts = new StringBuilder();

    private int attemptCount;

    public HighScoreModel() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;

        if (score > bestScore)
            bestScore = score;
    }

    public int getBestScore() {
        return bestScore;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

    public String getAttempts() {
        return attempts.toString();
    }

    public void setAttempts(int i, int count) {
        this.attempts.append(String.format("Attempt Number %d: %s", i, count));
        this.attempts.append(System.lineSeparator());
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(int attemptCount) {
        this.attemptCount += attemptCount;
    }

    @Override
    public String toString() {
        return String.format("Score: %d%n" +
                "Best Score: %d%n" +
                "Attempts: %s", score, bestScore, attempts.toString());
    }
}
