package com.hendyirawan.wisatadunia.repo;

import com.hendyirawan.wisatadunia.core.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
