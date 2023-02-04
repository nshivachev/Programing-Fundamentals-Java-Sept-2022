package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDec = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDec = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int i = 0;

        while (!firstDec.isEmpty() && !secondDec.isEmpty()) {
            if (firstDec.get(0) > secondDec.get(0)) {
                firstDec.add(firstDec.get(0));
                firstDec.add(secondDec.get(0));
            } else if (firstDec.get(0) < secondDec.get(0)){
                secondDec.add(secondDec.get(0));
                secondDec.add(firstDec.get(0));
            }
            firstDec.remove(0);
            secondDec.remove(0);
        }

        if (firstDec.isEmpty()) {
            System.out.println("Second player wins! Sum: " + getCardsSum(secondDec));
        } else {
            System.out.println("First player wins! Sum: " + getCardsSum(firstDec));
        }
    }
    public static int getCardsSum(List<Integer> winningDec) {
        int sum = 0;
        for (int card : winningDec) {
            sum += card;
        }
        return sum;
    }
}
