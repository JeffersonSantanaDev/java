package lessons;

public class Lesson20Break {
    public static void main(String[] args) {
        double carValue = 30000;

        for (double installment = 1; installment <= carValue ; installment++) {
            double installmentValue = carValue / installment;
            if (installmentValue < 1000) {
                break;
            }
            System.out.println("Installment " + installment + " U$ " + installmentValue);
        }
    }
}