package Fundamentals.MidExamPreparation;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] neighborhood = Arrays
                .stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        int currentPosition = 0;

        while (!command.equals("Love!")) {
            int jumpStep = Integer.parseInt(command.split("\\s+")[1]);
            currentPosition += jumpStep;
            if (currentPosition >= neighborhood.length) {
                currentPosition = 0;
            }
            if (neighborhood[currentPosition] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
            } else {
                neighborhood[currentPosition] -= 2;
                if (neighborhood[currentPosition] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                }
            }

            command = scanner.nextLine();
        }

        int failedHouseCount = 0;

        for (int house : neighborhood) {
            if (house != 0) {
                failedHouseCount++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        if (failedHouseCount == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", failedHouseCount);
        }
    }
}
