import java.util.ArrayList;
import java.util.List;

public class mainHouseholdAppliance {
     public static void main(String[] args) {
        List<householdAppliance> appliances = new ArrayList<>(); // Heterogeneous Collection
        appliances.add(new washingMachine());
        appliances.add(new refrigerator());

        for (householdAppliance appliance : appliances) {
            appliance.turnOn(); // Polymorphism in action

            if (appliance instanceof washingMachine) { // InstanceOf
                washingMachine washingMachine = (washingMachine) appliance; // Object Casting
                washingMachine.startWashing();
            } else if (appliance instanceof refrigerator) {
                refrigerator refrigerator = (refrigerator) appliance; // Object Casting
                refrigerator.storeFood();
            }
        }

        useAppliance(new washingMachine()); // Polymorphic Argument
        useAppliance(new refrigerator());
    }

    public static void useAppliance(householdAppliance appliance) { // Polymorphic Argument
        System.out.println("Using the appliance.");
        appliance.turnOn();
    }
}
