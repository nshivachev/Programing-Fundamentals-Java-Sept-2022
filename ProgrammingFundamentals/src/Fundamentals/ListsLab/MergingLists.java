package Fundamentals.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mergedList = new ArrayList<>();

        int smallerListSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < smallerListSize; i++) {
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));
        }

        if (firstList.size() > secondList.size()) {
            mergedList.addAll(firstList.subList(smallerListSize, firstList.size()));
        } else {
            mergedList.addAll(secondList.subList(smallerListSize, secondList.size()));
        }
        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", ""));
    }
}
