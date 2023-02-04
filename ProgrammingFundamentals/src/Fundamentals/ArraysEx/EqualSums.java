package Fundamentals.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqual = false;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int leftSide = 0; leftSide < i; leftSide++) {
                leftSum += numbers[leftSide];
            }

            for (int rightSide = i + 1; rightSide < numbers.length; rightSide++) {
                rightSum += numbers[rightSide];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                isEqual = true;
                break;
            }
        }
        if (!isEqual) {
            System.out.println("no");
        }
    }
}
