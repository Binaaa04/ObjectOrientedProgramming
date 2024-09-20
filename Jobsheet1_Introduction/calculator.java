import java.util.Scanner;

/**
 * calculator
 */
public class calculator {

    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        System.out.print("Input the number : ");
        int number1 = calculator.nextInt();
        System.out.print("Input the number : ");
        int number2 = calculator.nextInt();
        System.out.print("Input the operator (+ - * /) : ");
        char operator = calculator.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Operator tidak valid. Gunakan salah satu ");
                break;
        }
        calculator.close();
    }
}