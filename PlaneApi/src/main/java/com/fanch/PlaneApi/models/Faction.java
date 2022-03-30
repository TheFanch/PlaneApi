package com.fanch.PlaneApi.models;

import javax.persistence.*;

/**
 * Faction class
 *
 * represente a PLane Faction
 */
@Entity
@Table(name = "Faction")
public class Faction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String flag;

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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
