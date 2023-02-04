package Fundamentals.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersArrFirst[] = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numbersArrSecond[] = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean areNotIdentical = false;
        int sum = 0;

        for (int i = 0; i < numbersArrFirst.length; i++) {
            sum += numbersArrFirst[i];
            if (numbersArrFirst[i] != numbersArrSecond[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areNotIdentical = true;
                break;
            }
        }
        if (!areNotIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
