package exercises_chapter_one;

public class Exercise10 {
    public static void main(String[] args) {
        double kilometers = 15;
        double minutes = 50;
        double seconds = 30;
        double miles = kilometers / 1.6093;
        double hour = minutes / 60;
        double averageSpeed = miles / hour;
        System.out.println("Average speed in miles per hour is " + averageSpeed);
    }
}