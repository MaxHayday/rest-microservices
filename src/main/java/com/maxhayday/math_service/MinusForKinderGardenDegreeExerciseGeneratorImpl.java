package com.maxhayday.math_service;


import com.maxhayday.math_service.model.Exercise;

public class MinusForKinderGardenDegreeExerciseGeneratorImpl implements ExerciseGenerator {

    @Override
    public Exercise generate() {
        int a = RandomUtils.getRandomNumberUsingInts(1, 100);
        int b = RandomUtils.getRandomNumberUsingInts(1, a);
        return Exercise.builder()
                .question(a + Operation.SUBTRACTION.getOperator() + b)
                .answer(String.valueOf(a - b))
                .build();
    }
}
