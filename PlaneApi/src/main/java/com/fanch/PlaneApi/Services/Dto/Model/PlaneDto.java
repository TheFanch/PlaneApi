package com.fanch.PlaneApi.Services.Dto.Model;

import com.fanch.PlaneApi.models.Faction;
import com.fanch.PlaneApi.models.Motorization;
import com.fanch.PlaneApi.models.System;

public class PlaneDto {

    private String name;
    private String description;
    private String image;
    private Faction faction;
    private Motorization motorization;
    private System system;

    public PlaneDto(String name, String description, String image, Faction faction, Motorization motorization, System system){
        this.name = name;
        this.description = description;
        this.image = image;
        this.faction = faction;
        this.motorization = motorization;
        this.system = system;
    }

    /**
     * Getters and Setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public Motorization getMotorization() {
        return motorization;
    }

    public void setMotorization(Motorization motorization) {
        this.motorization = motorization;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }
}
