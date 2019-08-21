package com.hendyirawan.wisatadunia.repo;

import com.hendyirawan.wisatadunia.core.AttractionCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionCategoryRepository
        extends JpaRepository<AttractionCategory, Integer> {
}
