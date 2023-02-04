package Fundamentals.ArraysEx;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int[] train = new int[wagonsCount];
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
        }

        for (int wagon: train) {
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}