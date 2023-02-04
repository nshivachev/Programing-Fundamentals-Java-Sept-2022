package Fundamentals.ArraysEx;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        for (int i = 0; i < rows; i++) {
            String[] arr = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArray[i] = arr[0];
                secondArray[i] = arr[1];
            } else {
                firstArray[i] = arr[1];
                secondArray[i] = arr[0];
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
