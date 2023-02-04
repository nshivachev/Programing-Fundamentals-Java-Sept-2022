package Fundamentals.BasicSyntacExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadSet = lostGameCount / 2;
        int trashedMouse = lostGameCount / 3;
        int trashedKeyboard = 0;

        for (int i = 1; i <= lostGameCount; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                trashedKeyboard++;
            }
        }

        int trashedDisplay = trashedKeyboard / 2;
        double totalPrice = trashedDisplay * displayPrice + trashedKeyboard * keyboardPrice + trashedHeadSet * headsetPrice + trashedMouse * mousePrice;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
