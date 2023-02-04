    package Fundamentals.StringsLab;

    import java.util.Scanner;

    public class RepeatStrings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] textArr = scanner.nextLine().split("\\s+");
            String concatText = "";
            //StringBuilder concatText = new StringBuilder();

            for (String text : textArr) {
                for (int i = 0; i < text.length(); i++) {
                    concatText = concatText.concat(text);
                    //concatText.append(text);
                }
            }
            System.out.println(concatText);
        }
    }
