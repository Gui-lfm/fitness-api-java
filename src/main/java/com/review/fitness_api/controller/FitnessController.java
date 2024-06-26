package com.review.fitness_api.controller;

import com.review.fitness_api.dto.WorkoutCreationDto;
import com.review.fitness_api.dto.WorkoutDto;
import com.review.fitness_api.service.FitnessServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/fitness")
public class FitnessController implements FitnessControllerInterface {

    private FitnessServiceInterface fitnessService;

    @Autowired
    public FitnessController(FitnessServiceInterface fitnessService) {
        this.fitnessService = fitnessService;
    }

    @GetMapping
    public String getFitness() {
        return "Boas vindas à API de Fitness!";
    }

    @GetMapping("/workouts/{id}")
    public ResponseEntity<WorkoutDto> getWorkout(@PathVariable Long id) {
        Optional<WorkoutDto> optionalWorkoutDto = fitnessService.getWorkout(id);

        if (optionalWorkoutDto.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optionalWorkoutDto.get());
    }

    @PostMapping("/workouts")
    public ResponseEntity<WorkoutDto> postWorkout(@RequestBody WorkoutCreationDto workoutCreationDto){

        WorkoutDto createdWorkout = fitnessService.saveWorkout(workoutCreationDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdWorkout);
    }
}
