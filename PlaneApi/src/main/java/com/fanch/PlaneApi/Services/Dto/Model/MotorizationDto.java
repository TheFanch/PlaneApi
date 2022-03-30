package com.fanch.PlaneApi.Services.Dto.Model;

import com.fanch.PlaneApi.models.Faction;

public class MotorizationDto {

    private String name;
    private String type;
    private String brand;
    private Faction faction;

    public MotorizationDto(String name, String type, String brand, Faction faction){
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.faction = faction;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }
}
