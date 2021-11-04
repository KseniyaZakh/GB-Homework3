package gb.ru.homework3;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        ArrayList<String> bread = new ArrayList<>(10);
        bread.add("Хлеб Геркулес");
        bread.add("Хлеб Стройный рецепт");
        bread.add("Хлеб Бурже");
        bread.add("Хлеб Живая закваска");
        bread.add("Хлеб Бородинский");
        bread.add("Хлеб Тостовый");
        bread.add("Батон Утренний");
        bread.add("Хлеб Бурже");
        bread.add("Ягодное лукошко");
        bread.add("Хлеб Бородинский");
        HashSet<String> breadUniq = new HashSet<>(bread);
        System.out.println(breadUniq);
        System.out.println(breadUniq.size());

        HashMap<String, Integer> countMap = new HashMap<>();
        for (String word : bread) {
            int count = countMap.getOrDefault(word, 0) + 1;
            countMap.put(word, count);
        }
        System.out.println(countMap);
    }
}
