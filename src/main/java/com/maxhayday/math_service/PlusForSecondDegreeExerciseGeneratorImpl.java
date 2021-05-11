package com.maxhayday.math_service;


import com.maxhayday.math_service.model.Exercise;

public class PlusForSecondDegreeExerciseGeneratorImpl implements ExerciseGenerator {

    @Override
    public Exercise generate() {
        int a = RandomUtils.getRandomNumberUsingInts(0, 100);
        int b = RandomUtils.getRandomNumberUsingInts(0, 100);
        return Exercise.builder()
                .question(a + Operation.ADDITION.getOperator() + b)
                .answer(String.valueOf(a + b))
                .build();
    }
}
