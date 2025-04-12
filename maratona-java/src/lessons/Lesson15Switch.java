package lessons;

import java.util.Scanner;

public class Lesson15Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your gender? 'M' or 'F'?");
        char gender = scanner.next().charAt(0);
        switch (gender) {
            case 'M':
                System.out.println("Man");
                break;
            case 'F':
                System.out.println("Woman");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}