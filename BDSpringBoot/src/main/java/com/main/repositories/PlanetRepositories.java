package com.main.repositories;

import com.main.Planet;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepositories extends CrudRepository<Planet,Long> {

}