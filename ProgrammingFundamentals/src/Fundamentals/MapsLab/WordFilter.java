package Fundamentals.MapsLab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), wordsArray));
    }
}
