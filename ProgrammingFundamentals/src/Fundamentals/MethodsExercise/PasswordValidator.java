package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidLength = checkPasswordLength(password);
        boolean isValidContent = checkSymbolsAndDigitsOnlyExist(password);
        boolean isValidDigitCount = checkTwoDigitsExist(password);

        if(!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isValidDigitCount) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && isValidContent && isValidDigitCount) {
            System.out.println("Password is valid");
        }
    }
    public static boolean  checkPasswordLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean  checkSymbolsAndDigitsOnlyExist(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean  checkTwoDigitsExist(String password) {
        int digitCount = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}
