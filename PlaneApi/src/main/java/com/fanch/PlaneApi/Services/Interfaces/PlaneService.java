package com.fanch.PlaneApi.Services.Interfaces;

import com.fanch.PlaneApi.Services.Dto.Model.MotorizationDto;
import com.fanch.PlaneApi.Services.Dto.Model.PlaneDto;
import com.fanch.PlaneApi.models.Motorization;
import com.fanch.PlaneApi.models.Plane;
import com.fanch.PlaneApi.models.System;

import java.util.List;
import java.util.Optional;

public interface PlaneService {
    /**
     * Get Plane by id
     * @param planeId
     * @return Plane find by id
     */
    Optional<Plane> get(long planeId);

    /**
     * Get all Planes
     * @return java.util.List of all Planes
     */
    List<Plane> getAll();

    /**
     * Create a Plane
     * @param planeDto
     * @return the Plane created
     */
    Optional<Plane> create(PlaneDto planeDto);

    /**
     * delete a Plane
     * @param planeId
     */
    void delete(long planeId);

    /**
     * update a Plane
     * @param planeId, planeDto
     * @return the Plane update
     */
    Optional<Plane> update(long planeId, PlaneDto planeDto);

    /**
     * retrive Plane by id
     * @param planeId
     * @return Plane find by id
     */
    Optional<Plane> retrive(long planeId);
}
