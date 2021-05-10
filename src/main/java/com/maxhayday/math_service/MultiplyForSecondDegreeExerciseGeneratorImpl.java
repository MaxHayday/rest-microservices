package com.maxhayday.math_service;


import com.maxhayday.model.Exercise;

public class MultiplyForSecondDegreeExerciseGeneratorImpl implements ExerciseGenerator {

    @Override
    public Exercise generate() {
        int a = RandomUtils.getRandomNumberUsingInts(2, 10);
        int b = RandomUtils.getRandomNumberUsingInts(2, 10);
        return Exercise.builder()
                .question(a + " * " + b)
                .answer(String.valueOf(a * b))
                .build();
    }
}
