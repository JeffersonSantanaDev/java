package lessons;

import java.util.Scanner;

public class Lesson16Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the number of the day:");
        System.out.println("1.Sunday 2.Monday 3.Tuesday 4.Wednesday 5.Thursday 6.Friday 7.Saturday");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            case 7:
                System.out.println("Holiday");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Working day");
            default:
                System.out.println("Invalid option");
        }
    }
}