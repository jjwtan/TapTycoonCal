package com.jjwtan.logic;

import com.jjwtan.objects.Card;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ran on 24/1/2018.
 */
public class Organizer {
    List<Card> cards;

    public Organizer(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getAllOfCategory(String category) {
        return cards.stream().filter(card -> card.getCategoryMultiplierMap().containsKey(category)).collect(Collectors.toList());
    }
}
