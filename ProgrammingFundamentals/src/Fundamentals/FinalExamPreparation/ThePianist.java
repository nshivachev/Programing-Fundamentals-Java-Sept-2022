package Fundamentals.FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> composerMap = new LinkedHashMap<>();
        Map<String, String> keyMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] pianoPieceArr = scanner.nextLine().split("\\|");
            String piece = pianoPieceArr[0];
            String composer = pianoPieceArr[1];
            String key = pianoPieceArr[2];
            composerMap.put(piece, composer);
            keyMap.put(piece, key);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandArr = command.split("\\|");
            String piece = commandArr[1];
            if (command.contains("Add")) {
                String composer = commandArr[2];
                String key = commandArr[3];
                if (!composerMap.containsKey(piece)) {
                    composerMap.put(piece, composer);
                    keyMap.put(piece, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                } else {
                    System.out.println(piece + " is already in the collection!");
                }
            } else if (command.contains("Remove")) {
                if (composerMap.containsKey(piece)) {
                    composerMap.remove(piece);
                    keyMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            } else if (command.contains("ChangeKey")) {
                String newKey = commandArr[2];
                if (keyMap.containsKey(piece)) {
                    keyMap.put(piece, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            command = scanner.nextLine();
        }
        composerMap.entrySet().forEach(entry -> {
            String piece = entry.getKey();
            System.out.printf("%s -> Composer: %s, Key: %s%n", piece, entry.getValue(), keyMap.get(piece));
        });
    }
}