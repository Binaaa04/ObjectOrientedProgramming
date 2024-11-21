public class monster extends damageableObject {
    private int threatLevel;
    private String color;

    public monster(String name, int maxHealth, int threatLevel, String color, int posX, int posY) {
        super(name, maxHealth, posX, posY);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    @Override
    public void onKilled() {
        System.out.println(name + " the monster has been killed!");
    }

    public void makeNoise() {
        System.out.println(name + " makes a scary noise!");
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


