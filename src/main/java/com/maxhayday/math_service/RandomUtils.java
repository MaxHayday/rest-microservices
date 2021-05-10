package com.maxhayday.math_service;

import java.util.Random;

public class RandomUtils {
    private static Random random = new Random();

    public static int getRandomNumberUsingInts(int min, int max) {
        return random.ints(min, max)
                .findAny()
                .getAsInt();
    }
}
