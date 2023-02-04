package Fundamentals.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> likesMap = new LinkedHashMap<>();
        Map<String, Integer> commentsMap = new LinkedHashMap<>();

        int followersCount = 0;

        String command = scanner.nextLine();
        while (!command.equals("Log out")) {
            String username = command.split(": ")[1];
            if (command.contains("New follower")) {
                likesMap.putIfAbsent(username, 0);
                commentsMap.putIfAbsent(username, 0);
            } else if (command.contains("Like")) {
                int count = Integer.parseInt(command.split(": ")[2]);
                if (likesMap.containsKey(username)) {
                    likesMap.put(username, likesMap.get(username) + count);
                } else {
                    likesMap.put(username, count);
                    commentsMap.put(username, 0);
                }
            } else if (command.contains("Comment")) {
                if (commentsMap.containsKey(username)) {
                    commentsMap.put(username, commentsMap.get(username) + 1);
                } else {
                    commentsMap.put(username, 1);
                    likesMap.put(username, 0);
                }
            } else if (command.contains("Blocked")) {
                if (likesMap.containsKey(username)) {
                    likesMap.remove(username);
                    commentsMap.remove(username);
                } else {
                    System.out.println(username + " doesn't exist.");
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(likesMap.size() + " followers");
        likesMap.entrySet().forEach(entry -> {
            String username = entry.getKey();
            int likes = entry.getValue();
            int comments = commentsMap.get(username);
            System.out.printf("%s: %d%n", username, likes + comments);
        });
    }
}
