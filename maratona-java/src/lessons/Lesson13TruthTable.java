package lessons;

import java.util.Scanner;

public class Lesson13TruthTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats is your annual salary?");
        double salary = scanner.nextDouble();
        double income01 = salary * (35.82 / 100);
        double income02 = salary * (37.48 / 100);
        double income03 = salary * (49.50 / 100);
        double taxRate;
        if (salary <= 38441) {
            salary -= income01;
            taxRate = income01;
        } else if (salary > 38441 && salary <= 78817) {
            salary -= income02;
            taxRate = income02;
        } else {
            salary -= income03;
            taxRate = income03;
        }
        System.out.println("Annual salary: " + salary);
        System.out.println("Tax rate: " + taxRate);
    }
}