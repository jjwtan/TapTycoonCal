package com.jjwtan.utils;

import com.jjwtan.objects.Card;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Ran on 24/1/2018.
 */
public class PrintHelper {

    public static void printCards(List cards) {
        cards.forEach(System.out::println);
    }

    public static void printCardsOf(List<Card> cards, String category) {
        StringBuilder sb = new StringBuilder("Multipliers for ").append(category).append(":\n");
        cards.sort((o1, o2) -> o2.getCategoryMultiplierMap().get(category).compareTo(o1.getCategoryMultiplierMap().get(category)));
        cards.forEach(card -> {
            sb.append(String.format("%-25s", card.getName())).append(String.format("%12s", card.getCategoryMultiplierMap().get(category))).append("\n");
        });
        sb.append("===========================================");
        System.out.println(sb);
    }

    public static void printMultiplierResults(Map<String, BigDecimal> result) {
        result.forEach((x, y) -> {
            if (!x.matches("Stack of Bill amount|Stack of Bill chance|Upgrade Cost"))
                System.out.println(String.format("%-25s", x) + String.format("%12s", y.setScale(3, BigDecimal.ROUND_UP)));
        });
        System.out.println("===========================================");
    }
}
