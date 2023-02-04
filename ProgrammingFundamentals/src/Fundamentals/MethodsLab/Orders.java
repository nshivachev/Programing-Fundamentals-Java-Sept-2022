package Fundamentals.MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printTotalPrice(product, quantity);
    }

    public static void printTotalPrice(String product, int quantity) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", 1.5 * quantity);
                break;
            case "water":
                System.out.printf("%.2f", 1.0 * quantity);
                break;
            case "coke":
                System.out.printf("%.2f", 1.4 * quantity);
                break;
            case "snacks":
                System.out.printf("%.2f", 2.0 * quantity);
                break;
        }
    }
}
