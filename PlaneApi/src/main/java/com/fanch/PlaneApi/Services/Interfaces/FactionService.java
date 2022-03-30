package com.fanch.PlaneApi.Services.Interfaces;

import com.fanch.PlaneApi.Services.Dto.Model.FactionDto;
import com.fanch.PlaneApi.models.Faction;

import java.util.List;
import java.util.Optional;

public interface FactionService {
    /**
     * Get Faction by id
     * @param factionId
     * @return Faction find by id
     */
    Optional<Faction> get(long factionId);

    /**
     * Get all Factions
     * @return java.util.List of all Factions
     */
    List<Faction> getAll();

    /**
     * Create a Factions
     * @param factionDto
     * @return the Faction created
     */
    Optional<Faction> create(FactionDto factionDto);

    /**
     * delete a Factions
     * @param factionId
     */
    void delete(long factionId);

    /**
     * update a Factions
     * @param factionDto
     * @return the Faction update
     */
    Optional<Faction> update(long factionId,FactionDto factionDto);

    /**
     * retrive Faction by id
     * @param factionId
     * @return Faction find by id
     */
    Optional<Faction> retrive(long factionId);
}
