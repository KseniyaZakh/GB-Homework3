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
            if (countMap.containsKey(word)) {
                Integer count = countMap.get(word) + 1;
                countMap.put(word, count);
            } else {
                countMap.put(word, 1);
            }
        }
        System.out.println(countMap);
    }
}
