package Jobsheet3;

/**
 * motorcycleDemo
 */
public class motorcycleDemo {

    public static void main(String[] args) {
        motorcycle motor = new motorcycle();
        motor.setLicensePlate("B 0838 XZ");
        motor.setIsOnMachine(true);
        motor.setSpeed(90);
        motor.displayStatus();

        motorcycle motor2 = new motorcycle();
        motor2.setLicensePlate("N 9840 AB");
        motor2.setIsOnMachine(true);
        motor2.setSpeed(40);
        motor2.displayStatus();

        motorcycle motor3 = new motorcycle();
        motor3.setLicensePlate("D 8343 CV");
        motor3.setSpeed(-60);
        motor3.displayStatus();
    }
}