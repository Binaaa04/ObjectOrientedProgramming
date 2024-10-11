public class mainTriangle {
    public static void main(String[] args) {
        triangle triangle1 = new triangle();
        System.out.println("result the corner size of triangle if just know one corner : " + triangle1.cornerTotal(30));
        System.out.println(
                "result the corner size of triangle if just know two corner : " + triangle1.cornerTotal(60, 40));
        System.out.println("result the pythagoras of triangle if just know two corner : " + triangle1.perimeter(9, 5));
        System.out.println("result the perimater of triangle if known three side : " + triangle1.perimeter(25, 30, 15));
    }
}
