/**
 * The type High score model.
 */
public class HighScoreModel {
    private int score;
    private int bestScore;
    private final StringBuilder attempts = new StringBuilder();
    private int attemptCount;

    /**
     * Instantiates a new High score model.
     *
     * @param score     the score
     * @param bestScore the best score
     */
    public HighScoreModel(int score, int bestScore) {
        this.score = 0;
        this.bestScore = 0;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(int score) {
        this.score = score;

        if (score > bestScore)
            bestScore = score;
    }

    /**
     * Gets best score.
     *
     * @return the best score
     */
    public int getBestScore() {
        return bestScore;
    }

    /**
     * Sets best score.
     *
     * @param bestScore the best score
     */
    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

    /**
     * Gets attempts.
     *
     * @return the attempts
     */
    public String getAttempts() {
        return attempts.toString();
    }

    /**
     * Sets attempts.
     *
     * @param i     the
     * @param count the count
     */
    public void setAttempts(int i, int count) {
        this.attempts.append(String.format("Attempt Number %d : %s", i, count));
        this.attempts.append(System.lineSeparator());
    }

    /**
     * Gets attempt count.
     *
     * @return the attempt count
     */
    public int getAttemptCount() {
        return attemptCount;
    }

    /**
     * Sets attempt count.
     *
     * @param attemptCount the attempt count
     */
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