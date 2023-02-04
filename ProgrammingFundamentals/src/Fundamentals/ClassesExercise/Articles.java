package Fundamentals.ClassesExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Articles {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        public void override(String newAuthor) {
            System.out.printf("%s - %s: %s", title, content, author);
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleArr = scanner.nextLine().split(", ");
        Article article = new Article(articleArr[0], articleArr[1], articleArr[2]);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n; i++) {
            String[] command = scanner.nextLine().split(": ");
            switch (command[0]) {
                case "Edit":
                    article.edit(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.rename(command[1]);
                    break;
                default:
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
