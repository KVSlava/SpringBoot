package com.main.service;

import com.main.Planet;
import com.main.repositories.PlanetRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PlanetServiceImp implements PlanetService{

    @Autowired
    private PlanetRepositories planetRepositories;
    @Override
    public Planet savePlanet(Planet planet) {
        return planetRepositories.save(planet);
    }

    @Override
    public List<Planet> fetchPlanetList() {
        return (List<Planet>)
                planetRepositories.findAll();
    }

    @Override
    public Planet updatePlanet(Planet planet, Long Id) {
        Planet planetDB
                = planetRepositories.findById(Id)
                .get();

        if (Objects.nonNull(planet.getPlanetName())
                && !"".equalsIgnoreCase(
                planet.getPlanetName())) {
            planetDB.setPlanetName(
                    planet.getPlanetName());
        }

        if (Objects.nonNull(planet.getPlanetRadius())) {
            planetDB.setPlanetRadius(
                    planet.getPlanetRadius());
        }


        return planetRepositories.save(planetDB);
    }

    @Override
    public void deletePlanetById(Long Id) {
        planetRepositories.deleteById(Id);
    }
}
