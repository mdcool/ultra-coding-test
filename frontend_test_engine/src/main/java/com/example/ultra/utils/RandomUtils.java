package com.example.ultra.utils;

import java.util.List;
import java.util.Random;

public class RandomUtils {
    public static <T> T getRandomItem(List<T> list) {
        if (list.isEmpty())
            throw new IllegalArgumentException("Unable to get random element from empty list");
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }
}
