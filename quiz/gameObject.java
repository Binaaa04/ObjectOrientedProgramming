public class gameObject {
    public String name;
    public int posX;
    public int posY;

    public gameObject(String name, int posX, int posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    public void despawn() {
        System.out.println(name + " has despawned.");
    }
}