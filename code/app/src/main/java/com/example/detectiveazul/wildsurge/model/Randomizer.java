package com.example.detectiveazul.wildsurge.model;

import java.util.ArrayList;
import java.util.Collections;

public class Randomizer {
    public static String wildSurge() {
        ArrayList<WildValue> wildValues = new ArrayList<>();

        for (WildValue value: WildValue.values()) {
            wildValues.add(value);
        }

        Collections.shuffle(wildValues);

        return wildValues.get(0).getDescription();
    }
}
