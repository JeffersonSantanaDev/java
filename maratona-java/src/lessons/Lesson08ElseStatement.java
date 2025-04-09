package lessons;

public class Lesson08ElseStatement {
    public static void main(String[] args) {
        int age = 33;
        boolean isAuthorizedToDrive = age >= 33;

        if (isAuthorizedToDrive) {
            System.out.println("Authorized to obtain a driver's license");
        } else {
            System.out.println("Not authorized to obtain a driver license");
        }
    }
}