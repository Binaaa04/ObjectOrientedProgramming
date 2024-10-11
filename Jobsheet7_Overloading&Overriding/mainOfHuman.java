public class mainOfHuman {
    public static void main(String[] args) {
        human h1 = new lecture();
        human h2 = new student();
        human h3 = new human();
        lecture lecture1 = new lecture();
        student student1 = new student();
        h1.eat();
        h2.eat();
        h3.eat();

        h1.breath();
        h2.breath();
        h3.breath();

        lecture1.overtime();
        student1.sleep();
    }
}
