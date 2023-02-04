package Fundamentals.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> legendaryItemsMap = new LinkedHashMap<>();
        Map<String, Integer> junkItemsMap = new LinkedHashMap<>();

        legendaryItemsMap.put("shards", 0);
        legendaryItemsMap.put("fragments", 0);
        legendaryItemsMap.put("motes", 0);
        boolean isWin = false;

        while (!isWin) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int i = 0; i < input.length; i += 2) {
                String itemName = input[i + 1].toLowerCase();
                int itemCount = Integer.parseInt(input[i]);
                if (itemName.equals("shards") || itemName.equals("fragments") || itemName.equals("motes")) {
                    legendaryItemsMap.put(itemName, legendaryItemsMap.get(itemName) + itemCount);
                } else {
                    junkItemsMap.putIfAbsent(itemName, 0);
                    junkItemsMap.put(itemName, junkItemsMap.get(itemName) + itemCount);
                }
                if (legendaryItemsMap.get("shards") >= 250) {
                    legendaryItemsMap.put("shards", legendaryItemsMap.get("shards") - 250);
                    System.out.println("Shadowmourne obtained!");
                    isWin = true;
                    break;
                } else if (legendaryItemsMap.get("fragments") >= 250) {
                    legendaryItemsMap.put("fragments", legendaryItemsMap.get("fragments") - 250);
                    System.out.println("Valanyr obtained!");
                    isWin = true;
                    break;
                } else if (legendaryItemsMap.get("motes") >= 250) {
                    legendaryItemsMap.put("motes", legendaryItemsMap.get("motes") - 250);
                    System.out.println("Dragonwrath obtained!");
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        legendaryItemsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItemsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
