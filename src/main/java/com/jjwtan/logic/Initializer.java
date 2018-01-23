package com.jjwtan.logic;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjwtan.objects.Card;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Jeremy on 23/1/2018.
 */
public class Initializer {

    private final String JSON_FILE = "D:/java-projects/TapTycoonCal/src/main/resources/cards.json";

    public List processCards() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.<List<Card>>readValue(new File(JSON_FILE), new TypeReference<List<Card>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
