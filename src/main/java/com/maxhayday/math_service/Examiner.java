package com.maxhayday.math_service;

import com.maxhayday.math_service.model.Exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Examiner {

    private List<ExerciseGenerator> exerciseGenerators = List.of(
            new PlusForSecondDegreeExerciseGeneratorImpl(),
            new MinusForKinderGardenDegreeExerciseGeneratorImpl(),
            new MultiplyForSecondDegreeExerciseGeneratorImpl());

    public List<Exercise> getExercises(int amount) {
        return IntStream.range(0, amount)
                .mapToObj(i -> {
                    int j = RandomUtils.getRandomNumberUsingInts(0, exerciseGenerators.size());
                    return exerciseGenerators.get(j).generate();
                }).collect(Collectors.toList());
    }

}
