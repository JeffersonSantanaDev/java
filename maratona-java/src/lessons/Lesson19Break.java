package lessons;

public class Lesson19Break {
    public static void main(String[] args) {
        int maximumValue = 50;
        for (int i = 0; i < maximumValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}