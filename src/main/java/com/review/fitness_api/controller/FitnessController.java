package com.review.fitness_api.controller;

import com.review.fitness_api.service.FitnessServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
