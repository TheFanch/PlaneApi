package com.fanch.PlaneApi.Services.Impl;

import com.fanch.PlaneApi.Repository.PlaneRepository;
import com.fanch.PlaneApi.Services.Dto.Mapper.PlaneMapper;
import com.fanch.PlaneApi.Services.Dto.Model.PlaneDto;
import com.fanch.PlaneApi.Services.Interfaces.PlaneService;
import com.fanch.PlaneApi.models.Motorization;
import com.fanch.PlaneApi.models.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("PlaneService")
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    PlaneRepository planeRepository;
    public Optional<Plane> get(long planeId) {
        return planeRepository.findById(planeId);
    }

    public List<Plane> getAll() {
        return planeRepository.findAll();
    }

    public Optional<Plane> create(PlaneDto planeDto) {
        return Optional.of(planeRepository.save(PlaneMapper.toPlane(planeDto)));
    }

    @Override
    public void delete(long planeId) {
        planeRepository.delete(get(planeId).get());
    }

    @Override
    public Optional<Plane> update(long planeId, PlaneDto planeDto) {
        Plane plane = get(planeId).get();
        delete(planeId);
        return create(planeDto);
    }

    @Override
    public Optional<Plane> retrive(long planeId) {
        return planeRepository.findById(planeId);
    }
}
