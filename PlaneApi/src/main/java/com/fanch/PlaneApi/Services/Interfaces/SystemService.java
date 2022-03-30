package com.fanch.PlaneApi.Services.Interfaces;

import com.fanch.PlaneApi.Services.Dto.Model.SystemDto;
import com.fanch.PlaneApi.models.Plane;
import com.fanch.PlaneApi.models.System;

import java.util.List;
import java.util.Optional;

public interface SystemService {
    /**
     * Get System by id
     * @param systemId
     * @return System find by id
     */
    Optional<System> get(long systemId);

    /**
     * Get all Systems
     * @return java.util.List of all Systems
     */
    List<System> getAll();

    /**
     * Create a System
     * @param systemDto
     * @return the System created
     */
    Optional<System> create(SystemDto systemDto);

    /**
     * delete a System
     * @param systemId
     */
    void delete(long systemId);

    /**
     * update a Plane
     * @param systemId, systemDto
     * @return the Plane update
     */
    Optional<System> update(long systemId, SystemDto systemDto);

    /**
     * retrive Plane by id
     * @param systemId
     * @return Plane find by id
     */
    Optional<System> retrive(long systemId);
}
