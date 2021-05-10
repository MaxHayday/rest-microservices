package com.maxhayday.math_service;


import com.maxhayday.math_service.model.Exercise;

public class MinusForSecondDegreeExerciseGeneratorImpl implements ExerciseGenerator {


    @Override
    public Exercise generate() {
        int a = RandomUtils.getRandomNumberUsingInts(1, 100);
        int b = RandomUtils.getRandomNumberUsingInts(1, 100);
        return Exercise.builder()
                .question(a + " - " + b)
                .answer(String.valueOf(a - b))
                .build();

    }
}
