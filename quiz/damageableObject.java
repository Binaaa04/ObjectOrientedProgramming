public abstract class damageableObject extends gameObject {
    public int maxHealth;
    private int health;

    public damageableObject(String name, int maxHealth, int posX, int posY) {
        super(name, posX, posY);
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage. Health now: " + health);
        if (health <= 0) {
            onKilled();
        }
    }

    public abstract void onKilled();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
