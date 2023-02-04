package Fundamentals.MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(str, n));
    }
    public static String repeatString(String str, int n) {
        String repeatedString = "";
        for (int i = 1; i <= n; i++) {
            repeatedString = repeatedString + str;
        }
        return repeatedString;
    }
}
