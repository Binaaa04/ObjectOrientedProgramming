public class washingMachine extends householdAppliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine is starting.");
    }

    public void startWashing() {
        System.out.println("Washing machine is washing clothes.");
    }
}
