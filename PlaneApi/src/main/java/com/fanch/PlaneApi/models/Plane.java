package com.fanch.PlaneApi.models;

import javax.persistence.*;

/**
 * Faction class
 *
 * represente a PLane
 */
@Entity
@Table(name = "Plane")
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private String description;

    @ManyToOne
    @JoinColumn(name = "faction_id")
    private Faction faction;

    @ManyToOne
    @JoinColumn(name = "motorization_id")
    private Motorization motorization;

    @ManyToOne
    @JoinColumn(name = "system_id")
    private System system;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Getters and Setters
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

    public String getDescription() {
        return description;
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
