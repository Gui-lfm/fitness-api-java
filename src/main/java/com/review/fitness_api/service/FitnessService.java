package com.review.fitness_api.service;

import com.review.fitness_api.database.FakeFitnessDatabase;
import com.review.fitness_api.dto.WorkoutCreationDto;
import com.review.fitness_api.dto.WorkoutDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FitnessService implements FitnessServiceInterface {

    FakeFitnessDatabase fakeFitnessDatabase;

    @Autowired
    public FitnessService(FakeFitnessDatabase fakeFitnessDatabase) {
        this.fakeFitnessDatabase = fakeFitnessDatabase;
    }

    @Override
    public WorkoutDto saveWorkout(WorkoutCreationDto newWorkoutDto) {
        return null;
    }

    @Override
    public Optional<WorkoutDto> getWorkout(Long id) {
        return Optional.empty();
    }

    @Override
    public List<WorkoutDto> getAllWorkouts() {
        return List.of();
    }
}
