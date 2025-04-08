package lessons;

public class Lesson07IfStatement {
    public static void main(String[] args) {
        int age = 33;
        boolean isAuthorizedToDrive = age >= 18;
        if (isAuthorizedToDrive) {
            System.out.println("Authorized to obtain a driver's license");
        }

        if (isAuthorizedToDrive == false) {
            System.out.println("Not authorized to obtain a driver's license");
        }
    }
}