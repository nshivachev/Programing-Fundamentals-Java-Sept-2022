package Fundamentals.StringsLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannWord : bannArr) {
            String stars = "";
            int index = text.indexOf(bannWord);
            for (int i = 0; i < bannWord.length(); i++) {
                stars = stars.concat("*");
            }
            while (index != -1) {
                text = text.replace(bannWord, stars);
                index = text.indexOf(bannWord);
            }
        }
        System.out.println(text);
    }
}
