package Fundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        byte exhaustionFactor = Byte.parseByte(scanner.nextLine());

        int targets = 0;
        int halfPower = (int) (power * 0.5);

        while (power >= distance) {
            power -= distance;
            targets++;
            if (power == halfPower) {
                if (exhaustionFactor > 0) {
                    power = power / exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(targets);
    }
}
