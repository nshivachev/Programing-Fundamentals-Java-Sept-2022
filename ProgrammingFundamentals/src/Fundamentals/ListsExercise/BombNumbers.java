package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        String bombNumber = data[0];
        int bombPower = Integer.parseInt(data[1]);

        while (numbers.contains(bombNumber)) {
            int bombElementIndex = numbers.indexOf(bombNumber);
            int leftSide = Math.max(0, bombElementIndex - bombPower);
            int rightSide = Math.min(bombElementIndex + bombPower, numbers.size() - 1);

            for (int i = rightSide; i >= leftSide; i--) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());
    }
}
