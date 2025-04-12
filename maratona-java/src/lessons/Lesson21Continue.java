package lessons;

public class Lesson21Continue {
    public static void main(String[] args) {
        double totalValue = 30000;
        for (int installment = (int) totalValue; installment >= 1; installment--) {
            double installmentValue = totalValue / installment;
            if (installmentValue < 1000){
                continue;
            }
            System.out.println("Installment " + installment + " U$ " + installmentValue);
        }
    }
}