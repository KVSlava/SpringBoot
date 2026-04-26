package com.main.service;

import com.main.Planet;

import java.util.List;

public interface PlanetService {
    // Save operation
    Planet savePlanet(Planet planet);
    // Read operation
    List<Planet> fetchPlanetList();
    // Update operation
    Planet updatePlanet(Planet planet, Long Id);
    // Delete operation
    void deletePlanetById(Long Id);
}
