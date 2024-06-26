package com.review.fitness_api.service;

import com.review.fitness_api.dto.WorkoutCreationDto;
import com.review.fitness_api.dto.WorkoutDto;

import java.util.List;
import java.util.Optional;

/**
 * Interface for the Fitness service component.
 */
public interface FitnessServiceInterface {

    WorkoutDto saveWorkout(WorkoutCreationDto newWorkoutDto);

    Optional<WorkoutDto> getWorkout(Long id);

    List<WorkoutDto> getAllWorkouts();
}
