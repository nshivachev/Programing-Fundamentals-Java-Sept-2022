package Fundamentals.MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers[] = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArray = command.split("\\s+");
            String currentCommand = commandArray[0];
            switch (currentCommand) {
                case "swap":
                    int firstSwapIndex = Integer.parseInt(commandArray[1]);
                    int secondSwapIndex = Integer.parseInt(commandArray[2]);

                    int temp = numbers[firstSwapIndex];
                    numbers[firstSwapIndex] = numbers[secondSwapIndex];
                    numbers[secondSwapIndex] = temp;
                    break;
                case "multiply":
                    int firstMultiplyIndex = Integer.parseInt(commandArray[1]);
                    int secondMultiplyIndex = Integer.parseInt(commandArray[2]);

                    numbers[firstMultiplyIndex] = numbers[firstMultiplyIndex] * numbers[secondMultiplyIndex];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\]]", ""));
    }
}
