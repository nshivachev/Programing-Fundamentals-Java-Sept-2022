package Fundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        if (ch < 97) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
