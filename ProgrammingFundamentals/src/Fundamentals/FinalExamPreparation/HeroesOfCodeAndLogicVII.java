package Fundamentals.FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> healthMap = new LinkedHashMap<>();
        Map<String, Integer> manaMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String hero = scanner.nextLine();
            String heroName = hero.split("\\s+")[0];
            int heroHealth = Integer.parseInt(hero.split("\\s+")[1]);
            int heroMana = Integer.parseInt(hero.split("\\s+")[2]);
            healthMap.put(heroName, heroHealth);
            manaMap.put(heroName, heroMana);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandArr = command.split(" - ");
            String currentCommand = commandArr[0];
            String heroName = commandArr[1];
            if (currentCommand.equals("CastSpell")) {
                int neededMana = Integer.parseInt(commandArr[2]);
                String spellName = commandArr[3];
                int heroMana = manaMap.get(heroName);
                if (heroMana >= neededMana) {
                    int heroNewMana = heroMana - neededMana;
                    manaMap.put(heroName, heroNewMana);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroNewMana);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }
            } else if (currentCommand.equals("TakeDamage")) {
                int damage = Integer.parseInt(commandArr[2]);
                String attacker = commandArr[3];
                int heroHealth = healthMap.get(heroName);
                int currentHP = heroHealth - damage;
                if (currentHP > 0) {
                    healthMap.put(heroName, currentHP);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                } else {
                    healthMap.remove(heroName);
                    manaMap.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }

            } else if (currentCommand.equals("Recharge")) {
                int manaAmount = Integer.parseInt(commandArr[2]);
                int heroMana = manaMap.get(heroName);
                if (manaAmount + heroMana > 200) {
                    manaMap.put(heroName, 200);
                    System.out.printf("%s recharged for %d MP!%n", heroName, 200 - heroMana);
                } else {
                    manaMap.put(heroName, heroMana + manaAmount);
                    System.out.printf("%s recharged for %d MP!%n", heroName, manaAmount);
                }
            } else if (currentCommand.equals("Heal")) {
                int healthAmount = Integer.parseInt(commandArr[2]);
                int heroHealth = healthMap.get(heroName);
                if (healthAmount + heroHealth > 100) {
                    healthMap.put(heroName, 100);
                    System.out.printf("%s healed for %d HP!%n", heroName, 100 - heroHealth);
                } else {
                    healthMap.put(heroName, heroHealth + healthAmount);
                    System.out.printf("%s healed for %d HP!%n", heroName, healthAmount);
                }
            }
            command = scanner.nextLine();
        }

        healthMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue());
            System.out.println("  MP: " + manaMap.get(entry.getKey()));
        });
    }
}