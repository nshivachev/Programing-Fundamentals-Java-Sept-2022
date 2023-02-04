package Fundamentals.ClassesLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < words.length;) {
            int randomNumber = rnd.nextInt(words.length);
            System.out.println(words[randomNumber]);
            String[] proxyArray = new String[words.length - 1];
            for (int j = 0, k = 0; j < words.length; j++) {
                if (j != randomNumber) {
                    proxyArray[k++] = words[j];
                }
            }
            words = proxyArray;
        }
    }
}
