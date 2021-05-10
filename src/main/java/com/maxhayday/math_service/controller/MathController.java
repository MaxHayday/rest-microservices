package com.maxhayday.math_service.controller;

import com.maxhayday.math_service.Examiner;
import com.maxhayday.model.Exercise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class MathController {

    @GetMapping("/random")
    public List<Exercise> should_return_random_exercises(@RequestParam("count") int count) {
        Examiner examiner = new Examiner();
        List<Exercise> exercises = examiner.getExercises(count);
        return exercises;
    }
}
