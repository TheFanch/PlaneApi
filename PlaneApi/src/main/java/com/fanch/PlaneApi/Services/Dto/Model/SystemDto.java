package com.fanch.PlaneApi.Services.Dto.Model;

public class SystemDto {

    private String type;
    private String name;
    private String brand;

    public SystemDto(String type, String name, String brand){
        this.type = type;
        this.name = name;
        this.brand = brand;
    }

    /**
     *Getters and Settres
     */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
