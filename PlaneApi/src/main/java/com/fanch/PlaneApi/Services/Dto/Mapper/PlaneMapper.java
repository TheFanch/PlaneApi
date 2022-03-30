package com.fanch.PlaneApi.Services.Dto.Mapper;

import com.fanch.PlaneApi.Services.Dto.Model.PlaneDto;
import com.fanch.PlaneApi.models.Plane;

public class PlaneMapper {

    public static Plane toPlane(PlaneDto planeDto){
        Plane plane = new Plane();
        plane.setName(planeDto.getName());
        plane.setDescription(planeDto.getDescription());
        plane.setImage(planeDto.getImage());
        plane.setFaction(planeDto.getFaction());
        plane.setMotorization(planeDto.getMotorization());
        plane.setSystem(planeDto.getSystem());
        return plane;
    }
}
