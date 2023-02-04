package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNum, secondNum, thirdNum);
    }
    public static void printSmallestNumber(int firstNum, int secondNum, int thirdNum) {
        int minNum = 0;
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            minNum = firstNum;
        } else if (secondNum <= firstNum && secondNum <= thirdNum){
            minNum = secondNum;
        } else if (thirdNum <= firstNum && thirdNum <= secondNum){
            minNum = thirdNum;
        }
        System.out.println(minNum);
    }
}
