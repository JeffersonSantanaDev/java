package lessons;

public class Lesson17LoopingStatements {
    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter++);
        }
        System.out.println();
        counter = 1; // set counter = 1 again

        do {
            System.out.println(counter++);
        } while (counter <= 10);
        System.out.println();

        // for sets the counter = 1 again; for (counter = 1;
        for (counter = 1; counter <= 10; counter++) {
            System.out.println(counter);
        }
    }
}