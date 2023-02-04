package Fundamentals.FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> rarityPlantsMap = new LinkedHashMap<>();
        Map<String, Double> ratingPlantsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String plantName = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            ratingPlantsMap.put(plantName, 0.0);
            rarityPlantsMap.put(plantName, rarity);
        }

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Exhibition")) {
            String token[] = inputLine.split("[: -]+");
            String command = token[0];
            String plant = token[1];
            if (rarityPlantsMap.containsKey(plant)) {
                switch (command) {
                    case "Rate":
                        double rating = Double.parseDouble(token[2]);
                        if (ratingPlantsMap.get(plant) == 0) {
                            ratingPlantsMap.put(plant, rating);
                        } else {
                            double newRate = (ratingPlantsMap.get(plant) + rating) / 2;
                            ratingPlantsMap.put(plant, newRate);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(token[2]);
                        rarityPlantsMap.put(plant, rarity);
                        break;
                    case "Reset":
                        ratingPlantsMap.put(plant, 0.0);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("error");
            }
            inputLine = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : rarityPlantsMap.entrySet()) {
            double plantsRating = ratingPlantsMap.get(entry.getKey());
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), plantsRating);
        }
    }
}
