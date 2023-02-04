package Fundamentals.MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat ("##.##");

        System.out.println(df.format(calculate(firstNum, operator, secondNum)));
    }

    public static double calculate(int firstNum, String operator, int secondNum) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = 1.0 * firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            default:
                break;
        }
        return result;
    }
}
