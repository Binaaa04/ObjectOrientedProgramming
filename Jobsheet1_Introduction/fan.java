public class fan {

    public static void main(String[] args) {
        int[] serialNumbers = { 2345124, 2796079, 3456704, 4597086, 4560897, 7606965, 6596840, 6509872, 5069885,
                1243541 };
        String[] brands = { "Panasonic", "Sharp", "Electrolux", "LG", "Sharp", "Miyako", "Cosmos", "Maspion", "Sekai",
                "Regency" };
        int[] speeds = { 3, 2, 1, 3, 2, 1, 3, 2, 1, 3 };
        int[] directions = { 45, 90, 180, 60, 90, 180, 45, 60, 180, 45 };

        for (int i = 0; i < speeds.length; i++) {
            int speed = speeds[i];
            int direction = directions[i];

            System.out.print("Kipas with a serial number " + serialNumbers[i] + " (" + brands[i] + "): ");
            switch (speed) {
                case 1:
                    System.out.print("Low speed, ");
                    break;
                case 2:
                    System.out.print("Medium speed, ");
                    break;
                case 3:
                    System.out.print("High speed, ");
                    break;
                default:
                    System.out.print("Invalid!");
                    break;
            }

            switch (direction) {
                case 45:
                    System.out.println("Rotate an 45 degrees");
                    break;
                case 60:
                    System.out.println("Rotate an 60 degrees");
                    break;
                case 90:
                    System.out.println("Rotate an 90 degrees");
                    break;
                case 180:
                    System.out.println("Rotate an 180 degrees");
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }
}
