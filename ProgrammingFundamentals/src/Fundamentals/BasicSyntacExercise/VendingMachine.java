package Fundamentals.BasicSyntacExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coins = scanner.nextLine();
        double sum = 0;

        while (!coins.equals("Start")) {
            double currentCoins = Double.parseDouble(coins);
            if (currentCoins == 0.1 || currentCoins == 0.2 || currentCoins == 0.5 || currentCoins == 1 || currentCoins == 2) {
                sum = sum + currentCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            }
            coins = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double price = 0;
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    product = scanner.nextLine();
                    continue;
            }
            if (sum >= price) {
                System.out.println("Purchased " + product);
                sum = sum - price;
            } else {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
