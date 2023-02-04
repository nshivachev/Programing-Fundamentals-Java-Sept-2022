package Fundamentals.StringsExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal firstNumber = new BigDecimal(scanner.nextLine());
        BigDecimal secondNumber = new BigDecimal(scanner.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));
    }
}
