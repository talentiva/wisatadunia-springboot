package com.hendyirawan.wisatadunia.repo;

import com.hendyirawan.wisatadunia.core.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Integer> {
    List<Attraction> findAllByCityId(Integer cityId);
    List<Attraction> findAllByCityIdAndAttractionCategoryId(Integer cityId, Integer attractionCategoryId);
}
