package lessons;

public class Lesson25MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] daysOfEachMonth = new int[4][3];
        daysOfEachMonth[0][0] = 31;
        daysOfEachMonth[0][1] = 28;
        daysOfEachMonth[0][2] = 31;
        daysOfEachMonth[1][0] = 30;
        daysOfEachMonth[1][1] = 31;
        daysOfEachMonth[1][2] = 30;
        daysOfEachMonth[2][0] = 31;
        daysOfEachMonth[2][1] = 31;
        daysOfEachMonth[2][2] = 30;
        daysOfEachMonth[3][0] = 31;
        daysOfEachMonth[3][1] = 30;
        daysOfEachMonth[3][2] = 31;

        for (int i = 0; i < daysOfEachMonth.length; i++) {
            for (int j = 0; j < daysOfEachMonth[i].length; j++) {
                System.out.println(daysOfEachMonth[i][j]);
            }
        }
    }
}