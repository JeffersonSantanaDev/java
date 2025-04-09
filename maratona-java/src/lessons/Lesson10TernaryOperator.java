package lessons;

import java.util.Scanner;

public class Lesson10TernaryOperator {
    public static void main(String[] args) {
        double salary = 3000;
        String messageDonate = "I will donate $500 to DevDojo";
        String messageDoNotDonate = "I don't have the conditions yet, but I will!";
        String result = (salary > 5000) ? messageDonate : messageDoNotDonate;
        // (condition) ? true : false
        System.out.println(result);
    }
}