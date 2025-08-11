package com.example.tour_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.tour_api.model.TourPackage;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage, Long> {
}
