package com.fanch.PlaneApi.Services.Interfaces;

import com.fanch.PlaneApi.Services.Dto.Model.MotorizationDto;
import com.fanch.PlaneApi.models.Motorization;

import java.util.List;
import java.util.Optional;

public interface MotorizationService {
    /**
     * Get Faction by id
     * @param factionId
     * @return Faction find by id
     */
    Optional<Motorization> get(long factionId);

    /**
     * Get all Factions
     * @return java.util.List of all Systems
     */
    List<Motorization> getAll();

    /**
     * Create a Faction
     * @param motorizationDto
     * @return the Faction created
     */
    Optional<Motorization> create(MotorizationDto motorizationDto);

    /**
     * delete a motorization
     * @param motorizationId
     */
    void delete(long motorizationId);

    /**
     * update a Factions
     * @param motorizationId,motorizationDto
     * @return the Faction update
     */
    Optional<Motorization> update(long motorizationId, MotorizationDto motorizationDto);

    /**
     * retrive Faction by id
     * @param motorizationId
     * @return Faction find by id
     */
    Optional<Motorization> retrive(long motorizationId);
}
