package Fundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= lineNumber; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (sum + liters > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            sum = sum + liters;
        }
        System.out.println(sum);
    }
}
