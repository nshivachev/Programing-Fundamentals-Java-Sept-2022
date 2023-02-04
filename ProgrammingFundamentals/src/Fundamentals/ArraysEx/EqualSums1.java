package Fundamentals.ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqual = false;

        if (arr.length == 1) {
            System.out.println(0);
            isEqual = true;
        } else if (arr.length == 2) {
            if (arr[1] == 0) {
                System.out.println(0);
                isEqual = true;
            } else if (arr[0] == 0) {
                System.out.println(1);
                isEqual = true;
            }
        } else {
            int sumLeft = 0;
            for (int leftSide = 0; leftSide < arr.length - 2; leftSide++) {
                sumLeft += arr[leftSide];
                int sumRight = 0;

                for (int rightSide = leftSide + 2; rightSide < arr.length; rightSide++) {
                    sumRight += arr[rightSide];
                }
                if (sumRight == sumLeft) {
                    System.out.println(leftSide + 1);
                    isEqual = true;
                    break;
                }
            }
        }
        if (!isEqual) {
            System.out.println("no");
        }
    }
}
