package com.fanch.PlaneApi.Services.Dto.Mapper;

import com.fanch.PlaneApi.Services.Dto.Model.SystemDto;
import com.fanch.PlaneApi.models.System;

public class SystemMapper {

    public static System toSystem(SystemDto systemDto){
        System system = new System();
        system.setName(systemDto.getName());
        system.setBrand(systemDto.getBrand());
        system.setType(systemDto.getBrand());
        return system;
    }
}
