public class Project02MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[11][11];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
                System.out.println();
            }
        }
    }
}