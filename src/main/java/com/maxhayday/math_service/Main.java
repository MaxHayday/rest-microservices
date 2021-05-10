package com.maxhayday.math_service;

import com.maxhayday.model.Exercise;

public class Main {
    public static void main(String[] args) {
        MinusForKinderGardenDegreeExerciseGeneratorImpl minus = new MinusForKinderGardenDegreeExerciseGeneratorImpl();
        Exercise generate = minus.generate();
        System.out.println(generate);
    }
}
