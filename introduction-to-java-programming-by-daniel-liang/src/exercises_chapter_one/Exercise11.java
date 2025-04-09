package exercises_chapter_one;

public class Exercise11 {
    public static void main(String[] args) {
        double birthInSeconds = 7.0;
        double deathInSeconds = 13.0;
        double immigrationInSeconds = 45.0;

        double birthsPerYear = 31_536_000 / 7.0;
        double deathsPerYear = 31_536_000 / 13.0;
        double immigrationPerYear = 31_536_000 / 45.0;

        double currentPopulation = 312_032_486;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += birthsPerYear - deathsPerYear + immigrationPerYear;

            System.out.println("The population in year " + i + " will be ");
            System.out.printf("%1.0f", currentPopulation); //To prevent displaying in scientific notation
            System.out.println();
        }
    }
}
// https://github.com/HarryDulaney/intro-to-java-programming/blob/master/ch_01/Exercise01_11.java