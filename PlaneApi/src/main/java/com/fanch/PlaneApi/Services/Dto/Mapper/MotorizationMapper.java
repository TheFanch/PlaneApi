package com.fanch.PlaneApi.Services.Dto.Mapper;

import com.fanch.PlaneApi.Services.Dto.Model.MotorizationDto;
import com.fanch.PlaneApi.Services.Dto.Model.SystemDto;
import com.fanch.PlaneApi.models.Motorization;
import com.fanch.PlaneApi.models.System;

public class MotorizationMapper {

    public static Motorization toMotorization(MotorizationDto motorizationDto){
        Motorization motorization = new Motorization();
        motorization.setName(motorizationDto.getName());
        motorization.setType(motorizationDto.getType());
        motorization.setBrand(motorizationDto.getBrand());
        motorization.setFaction(motorizationDto.getFaction());
        return motorization;
    }
}
