package Fundamentals.MidExam;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adventureDays = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double water = adventureDays * players * Double.parseDouble(scanner.nextLine());
        double food = adventureDays * players * Double.parseDouble(scanner.nextLine());
        boolean noEnergy = false;

        for (int day = 1; day <= adventureDays; day++) {
            double energyLost = Double.parseDouble(scanner.nextLine());
            energy = energy - energyLost;

            if (energy <= 0) {
                noEnergy = true;
                break;
            }

            if (day % 2 == 0) {
                energy = energy + energy * 5 / 100;
                water = water - water * 30 / 100;
            }

            if (day % 3 == 0) {
                food = food - food / players;
                energy = energy + energy * 10 / 100;
            }
        }

        if (noEnergy) {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", food, water);
        } else {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }
    }
}
