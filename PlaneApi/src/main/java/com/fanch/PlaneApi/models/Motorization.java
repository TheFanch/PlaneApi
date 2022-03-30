package com.fanch.PlaneApi.models;

import javax.persistence.*;

/**
 * Faction class
 *
 * represente a PLane Motorization
 */
@Entity
@Table(name = "Motorization")
public class Motorization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    private String brand;

    @ManyToOne
    @JoinColumn(name = "faction_id")
    private Faction faction;

    /**
     *Getters and Setters
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
