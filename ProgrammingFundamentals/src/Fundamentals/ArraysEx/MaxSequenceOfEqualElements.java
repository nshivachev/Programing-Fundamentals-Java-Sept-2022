package Fundamentals.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxSequence = Integer.MIN_VALUE;
        int currentSequence = 1;
        int num = 0;


        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                currentSequence++;
                if (currentSequence > maxSequence) {
                    maxSequence = currentSequence;
                    num = numbers[i];
                }
            } else {
                currentSequence = 1;
            }
        }
        for (int i = 1; i <= maxSequence; i++) {
            System.out.print(num + " ");
        }
    }
}
