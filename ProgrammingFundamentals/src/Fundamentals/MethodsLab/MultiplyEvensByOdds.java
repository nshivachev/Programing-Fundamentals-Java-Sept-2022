package Fundamentals.MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(multipleOfEvenAndOddSum(number));
    }
    public static int multipleOfEvenAndOddSum(int number) {
        return getEvenSum(number) * getOddSum(number);
    }

    public static int getEvenSum(int number) {
        int[] numbers = Arrays
                .stream(Integer.toString(number).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int getOddSum(int number) {
        int[] numbers = Arrays
                .stream(Integer.toString(number).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}
