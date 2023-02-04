package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemonDistances = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (!pokemonDistances.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < pokemonDistances.size()) {
                int capturedPokemon = pokemonDistances.get(index);
                sum +=capturedPokemon;
                pokemonDistances.remove(index);
                modifyPokemonDistances(pokemonDistances, capturedPokemon);
            } else if (index < 0) {
                int capturedPokemon = pokemonDistances.get(0);
                sum += capturedPokemon;
                pokemonDistances.remove(0);
                pokemonDistances.add(0, pokemonDistances.get(pokemonDistances.size() - 1));
                modifyPokemonDistances(pokemonDistances, capturedPokemon);
            } else if (index >= pokemonDistances.size()) {
                int lastElement = pokemonDistances.size() - 1;
                int capturedPokemon = pokemonDistances.get(lastElement);
                sum += capturedPokemon;
                pokemonDistances.remove(lastElement);
                pokemonDistances.add(pokemonDistances.get(0));
                modifyPokemonDistances(pokemonDistances, capturedPokemon);
            }
        }
        System.out.println(sum);
    }
    public static void modifyPokemonDistances(List<Integer> pokemonDistances, int capturedPokemon) {
        for (int i = 0; i < pokemonDistances.size(); i++) {
            int replacedElement = pokemonDistances.get(i);
            if (pokemonDistances.get(i) <= capturedPokemon) {
                replacedElement += capturedPokemon;
            } else {
                replacedElement -= capturedPokemon;
            }
            pokemonDistances.set(i, replacedElement);
        }
    }
}
