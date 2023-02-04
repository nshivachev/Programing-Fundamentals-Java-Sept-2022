package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double result = 1.0 * calculateFactorial(firstNumber) / calculateFactorial(secondNumber);
        System.out.printf("%.2f", result);
    }
    public static long calculateFactorial(int number) {
        long fact = 1;
        for(int i = 1; i<=number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
