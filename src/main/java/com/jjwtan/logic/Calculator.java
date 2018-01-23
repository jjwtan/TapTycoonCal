package com.jjwtan.logic;

import com.jjwtan.objects.Card;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Ran on 23/1/2018.
 */
public class Calculator {
    private List<Card> cards;
    public Calculator(List<Card> cards) {
        this.cards = cards;
    }

    public Map getMultipliers() {
        Map<String, BigDecimal> multipliers = new TreeMap<>();
        cards.forEach(card -> {
            Map<String, BigDecimal> multiplyMap = card.getCategoryMultiplierMap();
            multiplyMap.forEach((x,y) -> populateMultiplier(multipliers, x, y));
        });

        if(multipliers.containsKey("All")) {
            multipliers.forEach((x, y) -> {
                BigDecimal allMultiplier = multipliers.get("All");
                if (!x.equals("All")) {
                    populateMultiplier(multipliers, x, allMultiplier);
                }
            });
        }
        return multipliers;
    }

    private void populateMultiplier(Map<String, BigDecimal> multipliers, String x, BigDecimal y) {
        BigDecimal prevVal = new BigDecimal(1.0);
        if(multipliers.containsKey(x)) {prevVal = multipliers.get(x);}
        multipliers.put(x,prevVal.multiply(y));
    }
}
