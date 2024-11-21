public class gameDemo {
    public static void main(String[] args) {
        monster monster1 = new monster("Goblin", 100, 5, "Green", 100, 100);
        monster1.makeNoise();
        monster1.takeDamage(30);
        monster1.takeDamage(80);

        player player1 = new player("Hero", 150, 0, "3", 200, 200);
        player1.takeDamage(50);
        player1.takeDamage(100);
    }
}