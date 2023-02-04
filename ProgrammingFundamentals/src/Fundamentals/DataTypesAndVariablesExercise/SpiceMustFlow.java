package Fundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalYield = 0;
        int days = 0;

        while (startingYield >= 100) {
            int currentYield = startingYield - 26;
            totalYield += currentYield;
            startingYield -= 10;
            days++;
        }
        if (totalYield >= 26) {
            totalYield -= 26;
        }
        System.out.println(days);
        System.out.println(totalYield);
    }
}
