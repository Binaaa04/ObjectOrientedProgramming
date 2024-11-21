public class refrigerator extends householdAppliance {
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is cooling.");
    }

    public void storeFood() {
        System.out.println("Refrigerator is storing food.");
    }
}
