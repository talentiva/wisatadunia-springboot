package com.hendyirawan.wisatadunia.repo;

import com.hendyirawan.wisatadunia.core.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Integer> {
}
