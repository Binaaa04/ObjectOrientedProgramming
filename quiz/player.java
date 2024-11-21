public class player extends damageableObject {
    private int score;
    private String livesRemaining;

    public player(String name, int maxHealth, int score, String livesRemaining, int posX, int posY) {
        super(name, maxHealth, posX, posY);
        this.score = score;
        this.livesRemaining = livesRemaining;
    }

    @Override
    public void onKilled() {
        System.out.println(name + " the player has died.");
    }

    // Getter dan Setter untuk score dan livesRemaining
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLivesRemaining() {
        return livesRemaining;
    }

    public void setLivesRemaining(String livesRemaining) {
        this.livesRemaining = livesRemaining;
    }
}
