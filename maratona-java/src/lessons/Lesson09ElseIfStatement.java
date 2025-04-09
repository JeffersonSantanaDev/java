package lessons;

import java.util.Scanner;

public class Lesson09ElseIfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        String category;

        if (age < 15) {
            category = "Children's category";
        } else if (age >= 15 && age < 18) {
            category = "Youth category";
        } else {
            category = "Adult category";
        }
        System.out.println(category);
    }
}