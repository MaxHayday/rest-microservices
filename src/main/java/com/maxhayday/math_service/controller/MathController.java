package com.maxhayday.math_service.controller;

import com.maxhayday.math_service.MathService;
import com.maxhayday.math_service.model.Exercise;
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
        MathService mathService = new MathService();
        List<Exercise> exercises = mathService.getExercises(count);
        return exercises;
    }
}
