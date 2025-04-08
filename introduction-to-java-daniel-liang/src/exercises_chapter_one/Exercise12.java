package exercises_chapter_one;

public class Exercise12 {
    public static void main(String[] args) {
        double miles = 24;
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double milesToKilometers = miles * 1.6;
        double minutesToHours = minutes / 60;
        double secondsToHours = seconds / 3600;
        double averageSpeed = milesToKilometers / (hours + minutesToHours + secondsToHours);

        System.out.println(averageSpeed);

    }
}
