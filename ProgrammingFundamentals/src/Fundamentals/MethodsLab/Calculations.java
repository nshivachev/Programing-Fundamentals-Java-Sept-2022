package Fundamentals.MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
            default:
                break;
        }
    }

    public static void add(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    public static void multiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    public static void subtract(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    public static void divide(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }
}
