package com.jjwtan;

import com.jjwtan.utils.MapUtil;
import com.jjwtan.utils.PrintHelper;
import com.jjwtan.logic.Calculator;
import com.jjwtan.logic.Initializer;
import com.jjwtan.logic.Organizer;
import com.jjwtan.objects.Card;

import java.util.List;

/**
 * Created by Ran on 23/1/2018.
 */
public class Application {
    public static void main(String[] args) {
        Initializer initializer = new Initializer();
        List<Card> cards = initializer.processCards();

        Calculator calculator = new Calculator(cards);
        PrintHelper.printMultiplierResults(MapUtil.sortByValue(calculator.getMultipliers()));

        Organizer organizer = new Organizer(cards);
        PrintHelper.printCardsOf(organizer.getAllOfCategory("Restaurant"),"Restaurant");

    }
}