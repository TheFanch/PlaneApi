package com.fanch.PlaneApi.Services.Dto.Mapper;

import com.fanch.PlaneApi.Services.Dto.Model.FactionDto;
import com.fanch.PlaneApi.models.Faction;

public class FactionMapper {

    public static Faction toFaction(FactionDto factionDto){
        Faction faction = new Faction();
        faction.setName(factionDto.getName());
        faction.setFlag(factionDto.getFlag());
        return faction;
    }
}
