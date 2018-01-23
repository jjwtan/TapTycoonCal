package com.jjwtan.objects;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by Jeremy on 23/1/2018.
 */
public class Card {
    String name;
    Map<String, BigDecimal> categoryMultiplierMap;
    Integer level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, BigDecimal> getCategoryMultiplierMap() {
        return categoryMultiplierMap;
    }

    public void setCategoryMultiplierMap(Map<String, BigDecimal> categoryMultiplierMap) {
        this.categoryMultiplierMap = categoryMultiplierMap;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardName: ").append(name).append("\n");
        categoryMultiplierMap.forEach((x, y)-> sb.append(x).append(": ").append(y).append("\n"));
        sb.append("Level: ").append(level).append("\n");

        return sb.toString();
    }
}
