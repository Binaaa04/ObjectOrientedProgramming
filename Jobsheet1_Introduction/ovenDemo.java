import java.util.Scanner;

/**
 * ovenDemo
 */
public class ovenDemo {

    public static void main(String[] args) {
        oven ovn = new oven();
        Scanner answer = new Scanner(System.in);

        ovn.brand = "Electrolux";
        ovn.temperature = 0;
        ovn.power = false;

        int option;

        do {
            System.out.println("=== Oven Control Menu ===");
            System.out.println("1. Turn ON the oven");
            System.out.println("2. Set temperature");
            System.out.println("3. Turn OFF the oven");
            System.out.print("Choose an option: ");

            option = answer.nextInt();

            switch (option) {
                case 1:
                    ovn.turnOn();
                    ovn.displayInfo();
                    break;
                case 2:
                    System.out.print("Enter the temperature: ");
                    int temp = answer.nextInt();
                    ovn.setTemperature(temp);
                    break;

                case 3:
                    ovn.turnOff();
                    return;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }

        } while (option != 3);

        answer.close();
    }
}
