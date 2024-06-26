package com.review.fitness_api.service;

import com.review.fitness_api.database.FakeFitnessDatabase;
import com.review.fitness_api.dto.WorkoutCreationDto;
import com.review.fitness_api.dto.WorkoutDto;
import com.review.fitness_api.model.Workout;
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

        Workout newWorkout = new Workout();
        newWorkout.setName(newWorkoutDto.name());
        newWorkout.setRepetitions(newWorkoutDto.repetitions());
        newWorkout.setSecretTechnique(newWorkoutDto.secretTechnique());

        Workout savedWorkout = fakeFitnessDatabase.saveWorkout(newWorkout);

        return new WorkoutDto(
                savedWorkout.getId(),
                savedWorkout.getName(),
                savedWorkout.getRepetitions()
        );
    }

    @Override
    public Optional<WorkoutDto> getWorkout(Long id) {
        Optional<Workout> optionalWorkout = fakeFitnessDatabase.getWorkout(id);

        if (optionalWorkout.isEmpty()) {
            return Optional.empty();
        }

        Workout foundWorkout = optionalWorkout.get();
        WorkoutDto workoutDto = new WorkoutDto(
                foundWorkout.getId(),
                foundWorkout.getName(),
                foundWorkout.getRepetitions()
        );

        return Optional.of(workoutDto);
    }

    @Override
    public List<WorkoutDto> getAllWorkouts() {
        return List.of();
    }
}
