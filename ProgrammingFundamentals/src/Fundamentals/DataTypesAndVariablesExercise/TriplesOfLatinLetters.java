package Fundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char firstLetter = 'a'; firstLetter < 'a' + n; firstLetter++) {
            for (char secondLetter = 'a'; secondLetter < 'a' + n; secondLetter++) {
                for (char thirdLetter = 'a'; thirdLetter < 'a' + n; thirdLetter++) {
                    System.out.printf("%c%c%c%n", firstLetter, secondLetter, thirdLetter);
                }
            }
        }
        //Second variant
        /*for (int i = 0; i < n; i++) {
            char firstLetter = (char) (97 + i);
            for (int j = 0; j < n; j++) {
                char secondLetter = (char) (97 + j);
                for (int k = 0; k < n; k++) {
                    char thirdLetter = (char) (97 + k);
                    System.out.printf("%c%c%c%n", firstLetter, secondLetter, thirdLetter);
                }
            }
        }*/
    }
}
