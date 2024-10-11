public class triangle {
    int corner;

    // overloading w/ one parameter
    public int cornerTotal(int cornerA) {
        return 180 - cornerA;
    }

    // Overloading w/ two parameters
    public int cornerTotal(int cornerA, int cornerB) {
        return 180 - (cornerA + cornerB);
    }

    // overloading w/ type data integer n three parameters
    public int perimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    // overloading w/ type data double n two parameters
    public double perimeter(int sideA, int sideB) {
        return Math.sqrt((sideA * sideA) + (sideB * sideB));
    }
}
