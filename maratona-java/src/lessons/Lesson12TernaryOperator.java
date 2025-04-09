package lessons;

import java.util.Scanner;

public class Lesson12TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        String category;
        category = age < 15 ? "Children's category" : age >= 15 && age < 18 ? "Youth category" : "Adult category";
        // The teacher does not recommend doing this above
        System.out.println(category);
    }
}
