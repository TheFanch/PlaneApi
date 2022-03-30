package com.fanch.PlaneApi.Services.Dto.Model;

public class FactionDto {

    private String name;
    private String flag;

    public FactionDto(String name, String flag){
        this.name = name;
        this.flag = flag;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
