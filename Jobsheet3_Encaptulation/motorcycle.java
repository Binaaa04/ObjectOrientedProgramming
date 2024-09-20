package Jobsheet3;

/**
 * motorcycle
 */
public class motorcycle {
    private String licensePlate;
    private boolean isOnMachine;
    private int speed;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isOnMachine() {
        return isOnMachine;
    }

    public void setIsOnMachine(boolean isOnMachine) {
        this.isOnMachine = isOnMachine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("value of speed can't be negative");
        } else if (!this.isOnMachine && speed <= 100) {
            System.out.println("Maximum speed is 100");
        } else if (!this.isOnMachine && speed > 0) {
            System.out.println("speed should not be more than zero if the engine is off");
        } else {
            this.speed = speed;
        }
    }

    public void displayStatus() {
        System.out.println("License plate : " + this.licensePlate);
        if (isOnMachine) {
            System.out.println("Machine is on");
        } else {
            System.out.println("Machine is off");
        }
        System.out.println("Speed : " + this.speed);
        System.out.println("==============================");
    }
}