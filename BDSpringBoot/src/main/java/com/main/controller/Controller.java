package com.main.controller;

import com.main.Planet;
import com.main.service.PlanetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired private PlanetService planetService;

    // Save operation
    @PostMapping("/planets")
    public Planet saveDepartment(
            @Valid @RequestBody Planet planet)
    {
        return planetService.savePlanet(planet);
    }

    // Read operation
    @GetMapping("/planets")
    public List<Planet> fetchDepartmentList()
    {
        return planetService.fetchPlanetList();
    }

    // Update operation
    @PutMapping("/planets/{id}")
    public Planet
    updateDepartment(@RequestBody Planet planet,
                     @PathVariable("id") Long Id)
    {
        return planetService.updatePlanet(
                planet, Id);
    }

    // Delete operation
    @DeleteMapping("/planets/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long Id)
    {
        planetService.deletePlanetById(
                Id);
        return "Deleted Successfully";
    }
}
