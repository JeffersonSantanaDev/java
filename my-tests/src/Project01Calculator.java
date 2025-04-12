import java.util.Scanner;

public class Project01Calculator {
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, - ,* or /");
        operator = input.next().charAt(0);

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid option");
        }

        input.close();
    }
}