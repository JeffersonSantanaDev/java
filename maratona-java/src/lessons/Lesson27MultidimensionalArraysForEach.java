package lessons;

public class Lesson27MultidimensionalArraysForEach {
    public static void main(String[] args) {
        int[][] days = new int[2][3];
        days[0][0] = 31;
        days[0][1] = 29;
        days[0][2] = 30;
        days[1][0] = 31;
        days[1][1] = 30;
        days[1][2] = 31;

        for(int[] arrayBase:days) {
            for(int num:arrayBase) {
                System.out.println(num);
            }
        }
    }
}