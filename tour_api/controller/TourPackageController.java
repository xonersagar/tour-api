package com.example.tour_api.controller;

import com.example.tour_api.model.TourPackage;
import com.example.tour_api.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tours")
public class TourPackageController {

    @Autowired
    private TourPackageRepository repository;

    @PostMapping
    public TourPackage createTour(@RequestBody TourPackage tourPackage) {
        return repository.save(tourPackage);
    }

    @GetMapping
    public List<TourPackage> getAllTours() {
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<TourPackage> getTourById(@PathVariable Long id) {
        return repository.findById(id);
    }
}