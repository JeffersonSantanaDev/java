package lessons;

public class Lesson06Operators {
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println(result);

        int remainderOfDivision = 21 % 7;
        System.out.println(remainderOfDivision);

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenDifferentFromTen = 10 != 10;
        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty " + isTenLessThanTwenty);
        System.out.println("isTenEqualToTwenty " + isTenEqualToTwenty);
        System.out.println("isTenEqualToTen " + isTenEqualToTen);
        System.out.println("isTenDifferentFromTen " + isTenDifferentFromTen);

        int age = 33;
        float wage = 2000F;
        boolean isWithinTheLawGreaterThanThirty = age > 30 && wage >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && wage >= 3381;

        System.out.println("isWithinTheLawGreaterThanThirty " + isWithinTheLawGreaterThanThirty);
        System.out.println("isWithinTheLawLessThanThirty " + isWithinTheLawLessThanThirty);

        double totalAmountCurrentAccount = 200;
        double totalAmountSavingsAccount = 10000;
        float playstationValue = 4000F;
        boolean isPlaystationPurchasable = totalAmountCurrentAccount >= playstationValue || totalAmountSavingsAccount >= playstationValue;
        System.out.println("isPlaystationPurchasable " + isPlaystationPurchasable);

        double salaryBonus = 1800;
        salaryBonus += 1000;
        salaryBonus -= 1000;
        salaryBonus *= 2;
        salaryBonus /= 2;
        salaryBonus %= 2;

        System.out.println(salaryBonus);

        int counter = 0;
        counter += 1; // counter = counter + 1;
        counter++;
        counter--;
        ++counter;
        --counter;
        System.out.println(counter);

        int counter2 = 0;
        System.out.println(counter2++);
        System.out.println(counter2);

        int counter3 = 0;
        System.out.println(++counter3);

    }
}