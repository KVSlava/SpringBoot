package com.main;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String planetName;
    private Long planetRadius;

    public Long getId() {return id;}

    public String getPlanetName() {return planetName;}

    public Long getPlanetRadius() {return planetRadius;}

    public void setId(Long id) {this.id = id;}

    public void setPlanetName(String planetName) {this.planetName = planetName;}

    public void setPlanetRadius(Long planetRadius) {this.planetRadius = planetRadius;}
}
